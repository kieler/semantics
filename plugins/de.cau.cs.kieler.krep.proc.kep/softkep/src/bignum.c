#define BN_VERSION "p38r1"

/*
 * Operations:
 *   add
 *   sub
 *   mul
 *   div
 *   rem
 *   binsize
 *   read with base
 *   write with base
 *   create
 *   delete
 */

/*
 * LD ??? cleanup assumptions about long long such as using LL
 */

/*
 * Internal representation:
 *   - sign    -1, 0, +1
 *   - size    0 means the number is 0
 *   - digits  one digit is one 32-bit unsigned int.
 *
 *   n = sign * sum_{i=0}^{size-1} digits_i . 2^{32*i} if size != 0
 *     = 0                                             if size == 0
 */

#include "bignum.h"


#include <stdlib.h>
#include <string.h>
#ifdef HAS_STDINT
#include <stdint.h>
typedef uint32_t u32_t;
typedef uint64_t u64_t;
#define DOUBLE_ONE  1ULL
#elif _MSC_VER
typedef unsigned int       u32_t;
typedef unsigned _int64    u64_t;
#define DOUBLE_ONE  ((u64_t)1)
#else
typedef unsigned int       u32_t;
typedef unsigned long long u64_t;
#define DOUBLE_ONE  1ULL
#endif
#include <limits.h>
#ifndef MAX
#define MAX(a,b) ((a) > (b) ? (a) : (b))
#endif
#ifndef MIN
#define MIN(a,b) ((a) < (b) ? (a) : (b))
#endif

/* types */
  /* LD ??? there are many assumptions in the code that an int fits in a *
   *        digit_t...                                                   */
typedef u32_t digit_t;                /* 32-bit unsigned int */
#define digit_t_cast(x) (digit_t)(x)

typedef u64_t double_digit_t;         /* 64-bit unsigned int */
struct bignum_s {
  int           sign;
  unsigned int  size;
  digit_t      *digits;
};

#define BITS_IN_DIGIT       (8 * sizeof(digit_t))
#define BITS_IN_DOUBLEDIGIT (8 * sizeof(double_digit_t))
#define BASE                (DOUBLE_ONE << BITS_IN_DIGIT)
#define MAX_DIGIT           ((digit_t)(BASE - 1))

#define SIZE(x)       ((x).size)
#define SIGN(x)       ((x).sign)
#define DIGITS(x)     ((x).digits)
#define DIGIT(x,idx)  DIGITS(x)[idx]

/* utilities */
#define MEMCOPY(dst, src, size) memcpy(dst, src, size)
#define MEMCLEAR(dst, size)     memset(dst, 0, size)
#define DIGITCLEAR(dst, nb)     MEMCLEAR(DIGITS(dst), sizeof(digit_t) * (nb))
#define DIGITCOPY(dst, src)     MEMCOPY(DIGITS(dst),                  \
                                        DIGITS(src),                  \
                                        SIZE(src) * sizeof(digit_t))
#define DIGITCOPYTEST(dst, src)  \
  do {                           \
    if (SIZE(src) != 0) {        \
      DIGITCOPY((dst), (src));   \
    }                            \
  } while (0)

/* memory management */
#define MALLOC(x)          malloc(x)
#define ALLOC(type)        ((type *)MALLOC(sizeof(type)))
#define ALLOCN(type,n)     ((type *)MALLOC(sizeof(type) * (n)))
#define ALLOC_BN           ALLOC(bignum_t)
#define FREE(ptr)          free(ptr)
#define REALLOC(x,size)    realloc((x), (size))
#define REALLOCN(x,type,n) ((type *)REALLOC((x), sizeof(type) * (n)))

static
void free_digits(bignum_t *bn)
{
  if (DIGITS(*bn) != NULL) {
    FREE(DIGITS(*bn));
  }
}

static
void bn_free(bignum_t *bn)
{
  if (bn != NULL) {
    free_digits(bn);
    FREE(bn);
  }
}

/* buffer where results are stored */
#define INIT_SIZE  128
static digit_t  bn_buffer[INIT_SIZE] = { 0 };
static unsigned int bn_res_size = INIT_SIZE;
static bignum_t bn_res = {
  1,         /* sign */
  INIT_SIZE, /* size */
  bn_buffer
};

/* handles reallocation of result buffer when its size is exceeded */
static
void handle_res(unsigned int size)
{
  if (size > bn_res_size) {
    if (DIGITS(bn_res) != bn_buffer) {
      FREE(DIGITS(bn_res));
    }
    DIGITS(bn_res) = ALLOCN(digit_t, 2 * bn_res_size);
    bn_res_size *= 2;
  }
}

static
void alloc_digits(bignum_t *nb, unsigned int size)
{
  if (SIZE(*nb) != size) {
    free_digits(nb);
    if (size != 0) {
      DIGITS(*nb) = ALLOCN(digit_t, size);
    } else {
      DIGITS(*nb) = NULL;
    }
  }
}

static
void copy(bignum_t *dst, bignum_t *src)
{
  alloc_digits(dst, SIZE(*src));
  SIGN(*dst) = SIGN(*src);
  SIZE(*dst) = SIZE(*src);
  DIGITCOPYTEST(*dst, *src);
}

/* normalize src into dst */
/* a number is normalized if:
 *   - its size is zero if number is 0 (digits field is NULL)
 *   - its size is the minimum (no leading 0)
 */
/* LD ??? right now no size reduction is done as unsigned_{add,sub,mul} already
   do it */
static
void normalize(bignum_t *dst, bignum_t *src)
{
  /* memory management */
  alloc_digits(dst, SIZE(*src));
  /* perform the copy */
  SIGN(*dst) = SIGN(*src);
  SIZE(*dst) = SIZE(*src);
  if (SIZE(*src) != 0) {
    DIGITCOPY(*dst, *src);
  }
}

/* addition of one unsigned bignum and a digit_t */
static
void unsigned_singleadd(bignum_t *res, bignum_t *a, digit_t term)
{
  unsigned int idx;
  digit_t      carry;

  carry = term;
  for (idx = 0; idx < SIZE(*a); idx++) {
    double_digit_t sum;
    sum =
        (double_digit_t) DIGIT(*a,idx)
      + (double_digit_t) carry;
    DIGIT(*res,idx) = digit_t_cast(sum);
    carry = digit_t_cast(sum >> BITS_IN_DIGIT);
  }
  if (carry != 0) {
    DIGIT(*res,idx) = carry;
  }
  SIZE(*res) = carry ? idx + 1 : idx;
}

/* addition of two unsigned bignum */
static
void unsigned_add(bignum_t *res, bignum_t *a, bignum_t *b)
{
  /* preconditions:
   *    size(a) >= size(b)
   *    res->digits has enough room to hold the result (that is it has at least
   *     size(a)+1 limbs)
   *    res can be a or b
   */

  unsigned int idx;
  digit_t      carry;

  carry = 0;
  for (idx = 0; idx < SIZE(*b); idx++) {
    double_digit_t sum;
    sum =
        (double_digit_t) DIGIT(*a,idx)
      + (double_digit_t) DIGIT(*b,idx)
      + (double_digit_t) carry;
    DIGIT(*res,idx) = digit_t_cast(sum);
    carry = digit_t_cast(sum >> BITS_IN_DIGIT);
  }
  for ( ; idx < SIZE(*a); idx++) {
    double_digit_t sum;
    sum =
        (double_digit_t) DIGIT(*a,idx)
      + (double_digit_t) carry;
    DIGIT(*res,idx) = digit_t_cast(sum);
    carry = digit_t_cast(sum >> BITS_IN_DIGIT);
  }
  DIGIT(*res,idx) = carry;
  SIZE(*res) = carry ? idx + 1 : idx;
}

/* subtraction of two unsigned bignum */
static
void unsigned_sub(bignum_t *res, bignum_t *a, bignum_t *b)
{
  /* preconditions:
   *    a >= b
   *    res->digits has enough room to hold the result (that is it has at least
   *     size(a) limbs)
   *    res can be a or b
   */

  int     idx;
  digit_t borrow;

  borrow = 0;
  for (idx = 0; (unsigned int)idx < SIZE(*b); idx++) {
    double_digit_t diff;
    diff =
        (double_digit_t) DIGIT(*a,idx)
      - (double_digit_t) DIGIT(*b,idx)
      - (double_digit_t) borrow;
    DIGIT(*res,idx) = digit_t_cast(diff);
    /* this assumes 2-complement arithmetic */
    borrow = digit_t_cast(diff >> (BITS_IN_DOUBLEDIGIT-1));           /* the borrow is msb */
  }
  for ( ; (unsigned int)idx < SIZE(*a); idx++) {
    double_digit_t diff;
    diff =
        (double_digit_t) DIGIT(*a,idx)
      - (double_digit_t) borrow;
    DIGIT(*res,idx) = digit_t_cast(diff);
    borrow = digit_t_cast(diff >> (BITS_IN_DOUBLEDIGIT-1));
  }
  /* at this point borrow is zero since a >= b */
  for (idx-- ; idx >= 0 && DIGIT(*res,idx) == 0; idx--) {
  }
  SIZE(*res) = idx >= 0 ? idx + 1 : 0;
}

/* multiplication of one unsigned bignum by a digit */
static
void unsigned_singlemul(bignum_t *res, bignum_t *a, digit_t factor)
{
  /* preconditions:
   *    res has enough room to hold result
   *    res can be a
   */
  unsigned int idx;
  digit_t      carry;

  carry = 0;
  for (idx = 0; idx < SIZE(*a); idx++) {
    double_digit_t prod;
    prod =
        (double_digit_t) DIGIT(*a,idx)
      * (double_digit_t) factor
      + (double_digit_t) carry;
    DIGIT(*res, idx) = digit_t_cast(prod);
    carry = digit_t_cast(prod >> BITS_IN_DIGIT);
  }
  if (carry != 0) {
    DIGIT(*res, idx) = carry;
    idx++;
  }
  for (idx-- ; idx >= 0 && DIGIT(*res,idx) == 0; idx--) {
  }
  SIZE(*res) = idx >= 0 ? idx + 1 : 0;
}

/* multiplication of two unsigned bignum */
static
void unsigned_mul(bignum_t *res, bignum_t *a, bignum_t *b)
{
  /* preconditions:
   *    a >= b ???
   *    res->digits has enough room to hold the result (that is it has at least
   *     size(a) + size(b) limbs)
   *    res can't neither be a or b
   */

  unsigned int idx_a, idx_b;
  unsigned int size_a, size_b;

  size_a = SIZE(*a);
  size_b = SIZE(*b);

  /* multiplication by zero is zero */
  if (size_a == 0 || size_b == 0) {
    SIGN(*res) = 0;
    SIZE(*res) = 0;
    return;
  }

  /* LD note: This clear could be suppressed but would make the computation *
   *          below harder to understand.                                   */
  DIGITCLEAR(*res, size_a + size_b);

  for (idx_a = 0; idx_a < size_a; idx_a++) {
    digit_t digit_a = DIGIT(*a,idx_a);
    digit_t carry   = 0;
    for (idx_b = 0; idx_b < size_b; idx_b++) {
      double_digit_t prod;
      prod =
	  (double_digit_t) digit_a
	* (double_digit_t) DIGIT(*b,idx_b)
	+ (double_digit_t) carry
	+ DIGIT(*res, idx_a + idx_b);
      DIGIT(*res, idx_a + idx_b) = digit_t_cast(prod);
      carry = digit_t_cast(prod >> BITS_IN_DIGIT);
    }
    DIGIT(*res, idx_a + size_b) = carry;
  }
  /* this works since result can't be zero */
  for (idx_a = size_a + size_b - 1;
       idx_a != 0 && DIGIT(*res,idx_a) == 0;
       idx_a--) {
  }
  SIZE(*res) = idx_a + 1;
}

/* computation of a^exponent */
static
void unsigned_pow(bignum_t *res, bignum_t *a, digit_t exponent)
{
  /* preconditions:
   *    a is not zero
   *    exponent > 0
   *    res->digits has enough room to hold the result
   */

  bignum_t *z;
  bignum_t *tmp;

  z = bn_create();
  tmp = bn_create();

  alloc_digits(tmp, 1);
  SIGN(*tmp) = 1;
  SIZE(*tmp) = 1;
  DIGIT(*tmp,0) = 1;

  copy(z, a);

  do {
    if ((exponent & 1) != 0) {
      bn_mul(tmp, tmp, z);
    }
    exponent >>= 1;
    if (exponent != 0) {
      bn_mul(z, z, z);
    } else {
      break;
    }
  } while (1);
  copy(res, tmp);
  bn_delete(tmp);
  bn_delete(z);
}

/* division of one unsigned bignum by a digit */
static
void unsigned_singlediv(bignum_t *res, bignum_t *a, digit_t divisor,
			int rem_flag, digit_t *rem)
{
  /* preconditions:
   *    res can be a
   *    same as unsigned_div (LD ??? check this once code is completed)
   */

  unsigned int idx_a;
  digit_t      remainder;

  remainder = 0;
  for (idx_a = SIZE(*a); idx_a != 0; idx_a--) {
    double_digit_t dividend;
    digit_t        result;
    dividend =
        ((double_digit_t)remainder << BITS_IN_DIGIT)
      | DIGIT(*a, idx_a-1);
    /* LD ??? prove digit_t is long enough to hold the result */
    result = digit_t_cast(dividend / divisor);
    remainder = digit_t_cast(dividend % divisor);
    DIGIT(*res, idx_a-1) = result;
  }
  for (idx_a = SIZE(*a) - 1;
       idx_a != 0 && DIGIT(*res,idx_a) == 0;
       idx_a--) {
  }
  if (idx_a == 0 && DIGIT(*res,idx_a) == 0) {
    SIZE(*res) = 0;
  } else {
    SIZE(*res) = idx_a + 1;
  }
  /* store remainder */
  if (rem_flag) {
    *rem = remainder;
  }
}

/* division of two unsigned bignum */
static
void unsigned_div(bignum_t *res, bignum_t *a, bignum_t *b,
		  int rem_flag, bignum_t *rem)
{
  /* preconditions:
   *    a >= b
   *    b != 0
   *    res->digits has enough room to hold the result (that is it has at least
   *     size(a) limbs)
   *    res can be a or b
   */

  /* LD note: Knuth's notations are used */

  unsigned int    j, m, n;
  bignum_t       *u, *v;
  double_digit_t  d;
  bignum_t        bn_d;
  digit_t         bn_d_digits[1];

  n = SIZE(*b);
  /* LD ???  what if m = 0? */
  m = SIZE(*a) - n;

  if (n == 1) {
    /* use a faster algo */
    digit_t remainder;
    unsigned_singlediv(res, a, DIGIT(*b,0), rem_flag, &remainder);
    if (rem_flag) {
      if (remainder == 0) {
	alloc_digits(rem, 0);
	SIGN(*rem) = 0;
	SIZE(*rem) = 0;
      } else {
	alloc_digits(rem, 1);
	SIGN(*rem) = SIGN(*a);
	SIZE(*rem) = 1;
	DIGIT(*rem, 0) = remainder;
      }
    }
    return;
  }
  /* 1. Normalize */
  u = bn_create();
  v = bn_create();
  d = BASE / ((double_digit_t)DIGIT(*b, n-1) + DOUBLE_ONE);
  SIGN(bn_d) = +1;
  DIGITS(bn_d) = bn_d_digits;
#ifdef DEBUG
  fprintf(stderr, "### d = %llu\n", d);
#endif
  SIZE(bn_d) = 1;
  DIGIT(bn_d, 0) = digit_t_cast(d);
  bn_mul(v, b, &bn_d);
  bn_mul(u, a, &bn_d);
  if (SIZE(*u) != n+m+1) {
    /* LD ??? this is a hack to increase size of u;  to remove this hack, *
     *        implement bn_mul(u, a, &bn_d) inline here                   */
    DIGITS(*u) = REALLOCN(DIGITS(*u), digit_t, SIZE(*u) + 1);
    DIGIT(*u,n+m) = 0;
  }
  /* 2. Start loop */
  /* LD note: our j is Knuth's j+1 because of unsigned being used */
  for (j = m+1; j > 0; j--) {
    double_digit_t q_hat, r_hat;
    double_digit_t dividend;
    digit_t        q_hat_final;
    /* 3. Compute q^ */
    dividend =
        ((double_digit_t)DIGIT(*u, j+n-1) << BITS_IN_DIGIT)
      | DIGIT(*u, j+n-2);
    q_hat = dividend / DIGIT(*v, n-1);
    r_hat = dividend % DIGIT(*v, n-1);
    while (q_hat == BASE
	   || (q_hat * (double_digit_t)DIGIT(*v, n-2)
	       > ((r_hat << BITS_IN_DIGIT) | DIGIT(*u, j+n-3)))) {
      q_hat--;
      r_hat += (double_digit_t)DIGIT(*v, n-1);
      if (r_hat >= BASE) {
	break;
      }
    }
    q_hat_final = digit_t_cast(q_hat);
#ifdef DEBUG
    fprintf(stderr, "### q_hat = %u\n", q_hat_final);
#endif
    /* 4. Update u */
    {
      unsigned int   idx;
      digit_t        carry;
      digit_t        borrow;
      double_digit_t diff;

      carry  = 0;
      borrow = 0;
      for (idx = 0; idx < n; idx++) {
	double_digit_t prod;
	prod =
	    (double_digit_t)q_hat_final * (double_digit_t)DIGIT(*v, idx)
	  + (double_digit_t)carry;
	diff =
	    (double_digit_t)DIGIT(*u, idx+j-1)
	  - (double_digit_t)(digit_t)prod
	  - (double_digit_t)borrow;
	DIGIT(*u, idx+j-1) = digit_t_cast(diff);
	carry = digit_t_cast(prod >> BITS_IN_DIGIT);
	borrow = digit_t_cast(diff >> (BITS_IN_DOUBLEDIGIT-1));  /* the borrow is msb */
      }
      diff =
	  (double_digit_t)DIGIT(*u, n+j-1)
	+ (double_digit_t)carry
	- (double_digit_t)borrow;
      DIGIT(*u, n+j-1) = digit_t_cast(diff);
      borrow = digit_t_cast(diff >> (BITS_IN_DOUBLEDIGIT-1));         /* the borrow is msb */
      /* 5/6. Store q_j and adjust */
      if (borrow != 0) {
	DIGIT(*res, j-1) = q_hat_final - 1;
	carry = 0;
	for (idx = 0; idx < n; idx++) {
	  double_digit_t sum;
	  sum =
	      (double_digit_t) DIGIT(*u,idx+j-1)
	    + (double_digit_t) DIGIT(*v,idx)
	    + (double_digit_t) carry;
	  DIGIT(*u,idx) = digit_t_cast(sum);
	  carry = digit_t_cast(sum >> BITS_IN_DIGIT);
	}
	DIGIT(*u,n+j-1) = DIGIT(*u,n+j-1) + carry;
      } else {
	DIGIT(*res, j-1) = q_hat_final;
      }
    }
    /* 7. End loop */
  }
  /* 8. Compute remainder */
  if (rem_flag) {
    /* LD ??? not done */
    alloc_digits(rem, SIZE(*u));
    /* Note:  we can play with u size since it will be freed just below */
    SIZE(*u) = n;
    unsigned_singlediv(rem, u, digit_t_cast(d), 0, NULL);
    if (SIZE(*rem) == 0) {
      SIGN(*rem) = 0;
    } else {
      SIGN(*rem) = SIGN(*a);
    }
  }
  /* 9. Cleanups */
  bn_free(v);
  bn_free(u);
  /* this works since result can't be zero */
  for (j = m;
       j != 0 && DIGIT(*res,j) == 0;
       j--) {
  }
  SIZE(*res) = j + 1;
}

bignum_t *bn_create(void)
{
  bignum_t *bn = ALLOC_BN;

  SIGN(*bn)   = 0;
  SIZE(*bn)   = 0;
  DIGITS(*bn) = NULL;

  return bn;
}

void bn_delete(bignum_t *bn)
{
  bn_free(bn);
}

void bn_set(bignum_t *res, bignum_t *a)
{
  copy(res, a);
}

bignum_t *bn_init_set(bignum_t *a)
{
  bignum_t *bn;

  bn = bn_create();
  copy(bn, a);

  return bn;
}

/* LD ??? assumes that an int fits in a digit_t... */
void bn_set_ui(bignum_t *res, unsigned int b)
{
  if (b != 0) {
    alloc_digits(res, 1);
    SIGN(*res)    = +1;
    SIZE(*res)    = 1;
    DIGIT(*res,0) = b;
  } else {
    free_digits(res);
    SIGN(*res)   = 0;
    SIZE(*res)   = 0;
    DIGITS(*res) = NULL;
  }
}

/* LD ??? assumes that an int fits in a digit_t... */
bignum_t *bn_init_set_ui(unsigned int b)
{
  bignum_t *bn;

  bn = bn_create();
  if (b != 0) {
    alloc_digits(bn, 1);
    SIGN(*bn)    = +1;
    SIZE(*bn)    = 1;
    DIGIT(*bn,0) = b;
  }

  return bn;
}

void bn_set_si(bignum_t *res, int b)
{
  if (b != 0) {
    alloc_digits(res, 1);
    SIGN(*res)    = (b < 0) ? -1 : +1;
    SIZE(*res)    = 1;
    DIGIT(*res,0) = (b < 0) ? -b : b;
  } else {
    free_digits(res);
    SIGN(*res)   = 0;
    SIZE(*res)   = 0;
    DIGITS(*res) = NULL;
  }
}

/* LD ??? assumes that an int fits in a digit_t... */
bignum_t *bn_init_set_si(int b)
{
  bignum_t *bn;

  bn = bn_create();
  if (b != 0) {
    alloc_digits(bn, 1);
    SIGN(*bn)    = (b < 0) ? -1 : +1;
    SIZE(*bn)    = 1;
    DIGIT(*bn,0) = (b < 0) ? -b : b;
  }

  return bn;
}

unsigned int bn_get_ui(bignum_t *a)
{
  if (SIGN(*a) == 0) {
    return 0;
  }
  return DIGIT(*a,0);
}

int bn_get_si(bignum_t *a)
{
  if (SIGN(*a) == 0) {
    return 0;
  }
  if (SIGN(*a) == -1) {
    return -DIGIT(*a,0);
  }
  return DIGIT(*a,0);
}

bignum_t *bn_init_set_str(const char *str, unsigned int base)
{
  bignum_t *bn;

  bn = bn_create();
  if (bn_set_str(bn, str, base) != 0) {
    bn_delete(bn);
    return NULL;
  }
  return bn;
}

static
int cmp(bignum_t *a, bignum_t *b, int abs_flag)
{
  unsigned int size_a, size_b;

  size_a = SIZE(*a);
  size_b = SIZE(*b);

  if (size_a > size_b) {
    if (abs_flag) {
      return +1;
    } else {
      return SIGN(*a) < 0 ? -1 : +1;
    }
  }
  if (size_a < size_b) {
    if (abs_flag) {
      return -1;
    } else {
      return SIGN(*b) < 0 ? +1 : -1;
    }
  }
  /* size_a == size_b */
  if (size_a == 0) {
    return 0;
  }
  /* skip equal leading digits */
  for ( ; size_a > 1 && DIGIT(*a, size_a - 1) == DIGIT(*b, size_a - 1);
	size_a--) {
  }
  if (DIGIT(*a, size_a - 1) > DIGIT(*b, size_a - 1)) {
    if (abs_flag) {
      return +1;
    } else {
      return SIGN(*a) < 0 ? -1 : +1;
    }
  }
  if (DIGIT(*a, size_a - 1) < DIGIT(*b, size_a - 1)) {
    if (abs_flag) {
      return -1;
    } else {
      return SIGN(*b) < 0 ? +1 : -1;
    }
  }
  if (abs_flag) {
    return 0;
  } else {
    return
      SIGN(*a) == SIGN(*b)
      ? 0
      : SIGN(*a) > SIGN(*b)
      ? +1
      : -1;
  }
}


/*
 * -1 if |a| < |b|
 *  0 if |a| = |b|
 *  1 if |a| > |b|
 */
static
int bn_cmp_abs(bignum_t *a, bignum_t *b)
{
  return cmp(a, b, 1);
}

void bn_neg(bignum_t *res, bignum_t *a)
{
  copy(res, a);
  SIGN(*res) = -SIGN(*res);
}

int bn_sgn(bignum_t *a)
{
  return SIGN(*a);
}

void bn_abs(bignum_t *res, bignum_t *a)
{
  copy(res, a);
  if (SIGN(*res) < 0) {
    SIGN(*res) = +1;
  }
}

/*
 * -1 if a < b
 *  0 if a = b
 *  1 if a > b
 */
int bn_cmp(bignum_t *a, bignum_t *b)
{
  return cmp(a, b, 0);
}

void bn_add_ui(bignum_t *res, bignum_t *a, unsigned int b)
{
  bignum_t bn_b;
  digit_t  bn_b_digits[1];

  if (b == 0) {
    SIGN(bn_b)     = 0;
    SIZE(bn_b)     = 0;
    DIGITS(bn_b)   = NULL;
  } else {
    SIGN(bn_b)     = +1;
    SIZE(bn_b)     = 1;
    bn_b_digits[0] = b;
    DIGITS(bn_b)   = bn_b_digits;
  }

  bn_add(res, a, &bn_b);
}

void bn_add(bignum_t *res, bignum_t *a, bignum_t *b)
{
  /* adjust bn_res size */
  handle_res(MAX(SIZE(*a), SIZE(*b)) + 1);

  /* check signs:
   *   a positive and b positive ->     a  +  b
   *   a negative and b negative -> - (|a| + |b|)
   *   a negative and b positive -> if |a| >= b then b - |a| else - (|a| - b)
   *   a positive and b negative -> if |b| <= a then a - |b| else - (|b| - a)
   */
  if (SIGN(*a) == SIGN(*b)) {
    if (SIZE(*a) >= SIZE(*b)) {
      unsigned_add(&bn_res, a, b);
    } else {
      unsigned_add(&bn_res, b, a);
    }
    SIGN(bn_res) = SIGN(*a);
    normalize(res, &bn_res);
  } else if (SIZE(*a) == 0) {
    copy(res, b);
  } else if (SIZE(*b) == 0) {
    copy(res, a);
  } else {
    bignum_t bn_absolute;
    int      sign_diff;

    /* LD ??? Consider swapping a and b depending on the sign;  this would *
     *        factorize some code but may make full coverage harder...     */

    if (SIGN(*a) < 0) {
      /* SIGN(*a) < 0, SIGN(*b) > 0 */
      /* Cases:
       *   b > 0
       *   b < 0
       */
      bn_absolute = *a;
      SIGN(bn_absolute) = +1;
      sign_diff = bn_cmp(b, &bn_absolute);
      if (sign_diff < 0) {
	/* |a| >  b  e.g. (a,b) = (-12,5) */
	unsigned_sub(&bn_res, &bn_absolute, b);
	SIGN(bn_res) = -1;
      } else if (sign_diff == 0) {
	/* |a| == b  e.g. (a,b) = (-12,12) */
	SIGN(bn_res) = 0;
	SIZE(bn_res) = 0;
      } else {
	/* |a| <  b  e.g. (a,b) = (-5,12) */
	unsigned_sub(&bn_res, b, &bn_absolute);
	SIGN(bn_res) = +1;
      }
    } else {
      /* SIGN(*a) > 0, SIGN(*b) <= 0 */
      /* Cases:
       *   a > 0  b < 0
       */
      bn_absolute = *b;
      SIGN(bn_absolute) = -SIGN(bn_absolute);
      sign_diff = bn_cmp(&bn_absolute, a);
      if (sign_diff > 0) {
	/* |b| >  a  e.g. (a,b) = (5,-12) */
	unsigned_sub(&bn_res, &bn_absolute, a);
	SIGN(bn_res) = -1;
      } else if (sign_diff == 0) {
	/* |b| == a  e.g. (a,b) = (12,-12) */
	SIGN(bn_res) = 0;
	SIZE(bn_res) = 0;
      } else {
	/* |b| <  a  e.g. (a,b) = (12,-5) */
	unsigned_sub(&bn_res, a, &bn_absolute);
	SIGN(bn_res) = +1;
      }
    }
    normalize(res, &bn_res);
  }
}

void bn_sub(bignum_t *res, bignum_t *a, bignum_t *b)
{
  bignum_t b_opposite;

  b_opposite = *b;
  SIGN(b_opposite) = -SIGN(b_opposite);
  bn_add(res, a, &b_opposite);
}

void bn_mul(bignum_t *res, bignum_t *a, bignum_t *b)
{
  /* adjust bn_res size */
  handle_res(SIZE(*a) + SIZE(*b));

  unsigned_mul(&bn_res, a, b);
  SIGN(bn_res) = SIGN(*a) * SIGN(*b);
  normalize(res, &bn_res);
}

void bn_sub_ui(bignum_t *res, bignum_t *a, unsigned int b)
{
  bignum_t bn_b;
  digit_t  bn_b_digits[1];

  if (b == 0) {
    SIGN(bn_b)     = 0;
    SIZE(bn_b)     = 0;
    DIGITS(bn_b)   = NULL;
  } else {
    SIGN(bn_b)     = +1;
    SIZE(bn_b)     = 1;
    bn_b_digits[0] = b;
    DIGITS(bn_b)   = bn_b_digits;
  }

  bn_sub(res, a, &bn_b);
}

int bn_div(bignum_t *res, bignum_t *a, bignum_t *b)
{
  if (SIZE(*b) == 0) {
    return -1;
  }

  if (bn_cmp_abs(a, b) < 0) {
    /* special case where divisor > dividend so the result is 0 */
    alloc_digits(res, 0);
    SIGN(*res) = 0;
    SIZE(*res) = 0;
    return 0;
  }

  /* adjust bn_res size */
  handle_res(SIZE(*a));

  unsigned_div(&bn_res, a, b, 0, NULL);
  SIGN(bn_res) = SIGN(*a) * SIGN(*b);
  normalize(res, &bn_res);

  return 0;
}

int bn_rem(bignum_t *res, bignum_t *a, bignum_t *b)
{
  if (SIZE(*b) == 0) {
    return -1;
  }

  if (bn_cmp_abs(a, b) < 0) {
    /* special case where divisor > dividend so the result is dividend */
    copy(res, a);
    return 0;
  }

  /* adjust bn_res size */
  handle_res(SIZE(*a));

  unsigned_div(&bn_res, a, b, 1, res);

  /* compute sign */
  /* LD ??? to be written */

  return 0;
}

int bn_pow_ui(bignum_t *res, bignum_t *a, unsigned int b)
{
  if (b == 0) {
#if 0
    // CR 5633: 0^0 must return 1
    if (SIZE(*a) == 0) {
      /* 0^0 is undefined */
      return -1;
    }
#endif
    /* x^0 = 1 */
    alloc_digits(res, 1);
    SIGN(*res)    = +1;
    SIZE(*res)    = 1;
    DIGIT(*res,0) = 1;
    return 0;
  }
  if (SIZE(*a) == 0) {
    /* 0^x = 0 */
    alloc_digits(res, 0);
    SIGN(*res) = 0;
    SIZE(*res) = 0;
    return 0;
  }

  /* adjust bn_res size */
  handle_res(SIZE(*a) * b);

  unsigned_pow(&bn_res, a, b);
  SIGN(bn_res) = (b & 1) == 0 ? +1 : SIGN(*a);
  normalize(res, &bn_res);

  return 0;
}

int bn_pow(bignum_t *res, bignum_t *a, bignum_t *b)
{
  digit_t exponent;

  if (SIZE(*b) > 1) {
    return -2;
  }
  if (SIGN(*b) < 0) {
    return -2;
  }
  if (SIZE(*b) == 0) {
#if 0
    // CR 5633: 0^0 must return 1
    if (SIZE(*a) == 0) {
      /* 0^0 is undefined */
      return -1;
    }
#endif
    /* x^0 = 1 */
    alloc_digits(res, 1);
    SIGN(*res) = 1;
    SIZE(*res) = 1;
    DIGIT(*res,0) = 1;
    return 0;
  }
  if (SIZE(*a) == 0) {
    /* 0^x = 0 */
    alloc_digits(res, 0);
    SIGN(*res) = 0;
    SIZE(*res) = 0;
    return 0;
  }

  /* since b has a signle digit and is > 0, exponent is just this: */
  exponent = DIGIT(*b,0);

  /* adjust bn_res size */
  handle_res(SIZE(*a) * exponent);

  unsigned_pow(&bn_res, a, exponent);
  SIGN(bn_res) = (exponent & 1) == 0 ? +1 : SIGN(*a);
  normalize(res, &bn_res);

  return 0;
}

unsigned int bn_binsize(bignum_t *a)
{
  unsigned int size_a;
  unsigned int nb_bits;
  digit_t      leading_digit;

  size_a = SIZE(*a);
  if (size_a == 0) {
    return 1;
  }

  nb_bits = (size_a - 1) * BITS_IN_DIGIT;
  leading_digit = DIGIT(*a, size_a-1);
  while (leading_digit != 0) {
    nb_bits++;
    leading_digit >>= 1;
  }

  return nb_bits;
}

void bn_binsize_bn(bignum_t *res, bignum_t *a)
{
  unsigned int binsize;

  binsize = bn_binsize(a);
  alloc_digits(res, 1);
  SIGN(*res)    = +1;
  SIZE(*res)    = 1;
  DIGIT(*res,0) = binsize;
}

/* -1 if n is not a power of 2
 *  x such that n = 2^x
 */
static
int is_a_power_of_2(unsigned int n)
{
  unsigned int x;

  if (n == 0) {
    return -1;
  }

  x = 0;
  while (n != 1) {
    if ((n & 1) != 0) {
      return -1;
    }
    x++;
    n >>= 1;
  }
  return x;
}

/* LD ??? check last digit */
#define LOG2_10 3.321928094887362    /* log_2(10) */
/* returns 0 in case of error */
unsigned int bn_sizeinbase(bignum_t *a, unsigned int base)
{
  unsigned int binsize;
  int          power;

  power = is_a_power_of_2(base);

  if (power <= 0 && base != 10) {
    return 0;
  }

  if (SIGN(*a) == 0) {
    return 1;
  }

  binsize = bn_binsize(a);
  if (power > 0) {
    if ((binsize % power) != 0) {
      return binsize / power + 1;
    } else {
      return binsize / power;
    }
  } else {
    /* base 10 */
    return (int)(binsize / LOG2_10) + 1;
  }
}

/* LD ??? assumes that an int fits in a digit_t... */
int bn_fits_sint_p(bignum_t *a)
{
  digit_t digit;

  if (SIZE(*a) == 0) {
    return 1;
  }
  if (SIZE(*a) > 1) {
    return 0;
  }
  digit = DIGIT(*a,0);
  if (SIGN(*a) > 0) {
    return DIGIT(*a,0) <= INT_MAX;
  } else {
    return DIGIT(*a,0) <= -(unsigned int)INT_MIN;
  }
}

/* LD ??? assumes that an int fits in a digit_t... */
int bn_fits_uint_p(bignum_t *a)
{
  if (SIGN(*a) == -1) {
    return 0;
  }
  return SIZE(*a) <= 1;
}


/*****************************************************************************
 * Bit manipulation functions
 *****************************************************************************/

void bn_setbit(bignum_t *a, unsigned int n)
{
  if (n >= BITS_IN_DIGIT * SIZE(*a)) {
    /* increase size */
    unsigned int i;

    DIGITS(*a) = REALLOCN(DIGITS(*a), digit_t, n / BITS_IN_DIGIT + 1);
    for (i = SIZE(*a); i < n / BITS_IN_DIGIT + 1; i++) {
      DIGIT(*a,i) = 0;
    }
    SIZE(*a) = n / BITS_IN_DIGIT + 1;
    if (SIGN(*a) == 0) {
      SIGN(*a) = +1;
    }
    /* set the bit */
    DIGIT(*a,n/BITS_IN_DIGIT) = 1 << n%BITS_IN_DIGIT;
  } else {
    /* set the bit */
    DIGIT(*a,n/BITS_IN_DIGIT) |= 1 << n%BITS_IN_DIGIT;
  }
}

void bn_clrbit(bignum_t *a, unsigned int n)
{
  if (n < BITS_IN_DIGIT * SIZE(*a)) {
    unsigned int index;

    index = n / BITS_IN_DIGIT;
    DIGIT(*a,index) &= ~(1 << n%BITS_IN_DIGIT);
    if (index == SIZE(*a) - 1
	&& DIGIT(*a,index) == 0) {
      /* adjust size */
      /* look for first non zero digit */
      int i;

      for (i = SIZE(*a) - 2; i >= 0 && DIGIT(*a,i) == 0; i--) {
      }
      if (i < 0) {
	FREE(DIGITS(*a));
	SIGN(*a)   = 0;
	SIZE(*a)   = 0;
	DIGITS(*a) = 0;
      } else {
	/* note:  size reduction */
	DIGITS(*a) = REALLOCN(DIGITS(*a), digit_t, i + 1);
	SIZE(*a) = i + 1;
      }
    }
  }
}

int bn_tstbit(bignum_t *a, unsigned int n)
{
  if (n < BITS_IN_DIGIT * SIZE(*a)) {
    return (DIGIT(*a,n/BITS_IN_DIGIT) >> n%BITS_IN_DIGIT) & 1;
  }
  return 0;
}


/*****************************************************************************
 * Logical functions
 *****************************************************************************/

void bn_and(bignum_t *res, bignum_t *a, bignum_t *b)
{
  unsigned int size, i;

  /* special case:  one or both args are zero */
  if (SIGN(*a) == 0 || SIGN(*b) == 0) {
    free_digits(res);
    SIGN(*res)   = 0;
    SIZE(*res)   = 0;
    DIGITS(*res) = NULL;
    return;
  }

  /* the size of the result is the one of the smallest operands */
  size = MIN(SIZE(*a), SIZE(*b));
  SIZE(bn_res) = size;

  /* adjust bn_res size */
  handle_res(size);

  for (i = 0; i < size; i++) {
    DIGIT(bn_res,i) = DIGIT(*a,i) & DIGIT(*b,i);
  }

  /* adjust size */
  for (i = size - 1; i > 0 && DIGIT(bn_res,i) == 0; i--) {
  }
  if (i == 0 && DIGIT(bn_res,0) == 0) {
    SIGN(bn_res) = 0;
    SIZE(bn_res) = 0;
  } else {
    SIZE(bn_res) = i + 1;
    /* ??? what about sign? */
    SIGN(bn_res) = +1;
  }

  normalize(res, &bn_res);
}

void bn_ior(bignum_t *res, bignum_t *a, bignum_t *b)
{
  unsigned int max_size, min_size, i;

  /* the size of the result is the one of the largest operands */
  max_size = MAX(SIZE(*a), SIZE(*b));

  /* adjust bn_res size */
  handle_res(max_size);
  SIZE(bn_res) = max_size;

  min_size = MIN(SIZE(*a), SIZE(*b));
  for (i = 0; i < min_size; i++) {
    DIGIT(bn_res,i) = DIGIT(*a,i) | DIGIT(*b,i);
  }
  if (SIZE(*a) < SIZE(*b)) {
    for ( ; i < max_size; i++) {
      DIGIT(bn_res,i) = DIGIT(*b,i);
    }
  } else {
    for ( ; i < max_size; i++) {
      DIGIT(bn_res,i) = DIGIT(*a,i);
    }
  }

  if (max_size == 0) {
    SIGN(bn_res) = 0;
  } else {
    /* ??? what about sign? */
    SIGN(bn_res) = +1;
  }
  normalize(res, &bn_res);
}

void bn_xor(bignum_t *res, bignum_t *a, bignum_t *b)
{
  unsigned int max_size, min_size, i;

  /* special case:  both args are zero */
  if (SIGN(*a) == 0 && SIGN(*b) == 0) {
    free_digits(res);
    SIGN(*res)   = 0;
    SIZE(*res)   = 0;
    DIGITS(*res) = NULL;
    return;
  }

  /* the size of the result is the one of the largest operands */
  max_size = MAX(SIZE(*a), SIZE(*b));

  /* adjust bn_res size */
  handle_res(max_size);
  SIZE(bn_res) = max_size;

  min_size = MIN(SIZE(*a), SIZE(*b));
  for (i = 0; i < min_size; i++) {
    DIGIT(bn_res,i) = DIGIT(*a,i) ^ DIGIT(*b,i);
  }
  if (SIZE(*a) < SIZE(*b)) {
    for ( ; i < max_size; i++) {
      DIGIT(bn_res,i) = DIGIT(*b,i);
    }
  } else {
    for ( ; i < max_size; i++) {
      DIGIT(bn_res,i) = DIGIT(*a,i);
    }
  }

  /* adjust size */
  for (i = max_size - 1; i > 0 && DIGIT(bn_res,i) == 0; i--) {
  }
  if (i == 0 && DIGIT(bn_res,0) == 0) {
    SIGN(bn_res) = 0;
    SIZE(bn_res) = 0;
  } else {
    SIZE(bn_res) = i + 1;
    /* ??? what about sign? */
    SIGN(bn_res) = +1;
  }

  normalize(res, &bn_res);
}

/* ??? gmp has no similar stuff and since it does not match our needs... */
void bn_com(bignum_t *res, bignum_t *a)
{
  unsigned int size, i;
  digit_t      leading_digit, mask;

  /* 0 is a special case:  result is -1 */
  if (SIGN(*a) == 0) {
    alloc_digits(res, 1);
    SIGN(*res) = -1;
    SIZE(*res) = 1;
    DIGIT(*res,0) = 1;
    return;
  }

  size = SIZE(*a);
  for (i = 0; i < size - 1; i++) {
    DIGIT(bn_res,i) = ~DIGIT(*a,i);
  }
  /* most significant digit is a particular case as we don't want to invert
   * the most significant bits that are zero
   */
  /* ??? there's probably some bit trickery that'd be faster... */
  leading_digit = DIGIT(*a,size-1);
  for (mask = 1U << (BITS_IN_DIGIT - 1);
       (mask & leading_digit) == 0;
       mask >>= 1) {
  }
  mask = (mask << 1) - 1;
  DIGIT(bn_res,size-1) = ~leading_digit & mask;

  /* adjust size */
  for (i = size - 1; i > 0 && DIGIT(bn_res,i) == 0; i--) {
  }
  if (i == 0 && DIGIT(bn_res,0) == 0) {
    SIGN(bn_res) = 0;
    SIZE(bn_res) = 0;
  } else {
    SIZE(bn_res) = i + 1;
    /* gmp inverts the sign... */
    SIGN(bn_res) = -SIGN(*a);
  }

  normalize(res, &bn_res);
}

/* not a = a xor (2^b - 1) */
/* assumes b > binsize(a) */
void bn_not_with_size(bignum_t *res, bignum_t *a, unsigned int b)
{
  unsigned int size, i;

  size = (b + BITS_IN_DIGIT - 1) / BITS_IN_DIGIT;

  /* adjust bn_res size */
  handle_res(size);

  if (SIGN(*a) != 0) {
    for (i = 0; i < SIZE(*a); i++) {
      DIGIT(bn_res,i) = ~DIGIT(*a,i);
    }
  } else
    i = 0;
  for ( ; i < size - 1; i++) {
    DIGIT(bn_res,i) = ~0;
  }
  if (size == SIZE(*a)) {
    if (b % BITS_IN_DIGIT == 0) {
      DIGIT(bn_res,size-1) = DIGIT(*a,size-1) ^ ~0;
    } else {
      DIGIT(bn_res,size-1) = DIGIT(*a,size-1) ^ ((1 << (b % BITS_IN_DIGIT)) - 1);
    }
  } else {
    if (b % BITS_IN_DIGIT == 0) {
      DIGIT(bn_res,size-1) = ~0;
    } else {
      DIGIT(bn_res,size-1) = (1 << (b % BITS_IN_DIGIT)) - 1;
    }
  }

  /* adjust size */
  for (i = size - 1; i > 0 && DIGIT(bn_res,i) == 0; i--) {
  }
  if (i == 0 && DIGIT(bn_res,0) == 0) {
    free_digits(res);
    SIGN(*res)   = 0;
    SIZE(*res)   = 0;
    DIGITS(*res) = NULL;
  } else {
    /* keep the sign */
    if (SIGN(*a) == 0) {
      SIGN(bn_res) = +1;
    } else {
      SIGN(bn_res) = SIGN(*a);
    }
    SIZE(bn_res) = i + 1;
    normalize(res, &bn_res);
  }
}

void bn_lshift(bignum_t *res, bignum_t *a, unsigned int b)
{
  unsigned int  binsize_res;
  unsigned int  idx;
  digit_t      *p_digits;
  digit_t       incoming;
  unsigned int  shift_count;

  /* special case zero */
  if (SIGN(*a) == 0) {
    free_digits(res);
    SIGN(*res)   = 0;
    SIZE(*res)   = 0;
    DIGITS(*res) = NULL;
    return;
  }

  binsize_res = bn_binsize(a) + b;

  /* adjust bn_res size */
  handle_res((binsize_res + BITS_IN_DIGIT - 1) / BITS_IN_DIGIT);

  p_digits = DIGITS(bn_res);
  for (idx = b / BITS_IN_DIGIT; idx > 0; idx--) {
    *p_digits++ = 0;
  }

  incoming = 0;
  shift_count = b % BITS_IN_DIGIT;
  if ( shift_count ) {
     for (idx = 0; idx < SIZE(*a); idx++) {
        double_digit_t shiftres;
        shiftres =
           ((double_digit_t)DIGIT(*a,idx) << shift_count)
           | incoming;
        *p_digits++ = digit_t_cast(shiftres);
        incoming = digit_t_cast(shiftres >> BITS_IN_DIGIT);
     }
     if (incoming != 0) {
        *p_digits++ = incoming;
     }
  }
  else {
     /* shift_count == 0 */
     for (idx = 0; idx < SIZE(*a); idx++) {
        *p_digits++ = DIGIT(*a,idx);
     }
  }

  /* keep the sign */
  SIGN(bn_res) = SIGN(*a);
  SIZE(bn_res) = (binsize_res + BITS_IN_DIGIT - 1) / BITS_IN_DIGIT;
  normalize(res, &bn_res);
}

void bn_rshift(bignum_t *res, bignum_t *a, unsigned int b)
{
  unsigned int    binsize_a;
  unsigned int    binsize_res;
  unsigned int    size_res;
  unsigned int    idx;
  unsigned int    idx_res;
  digit_t        *p_digits;
  digit_t         incoming;
  unsigned int    shift_count;
  digit_t         shiftres;

  binsize_a = bn_binsize(a);

  /* special case zero or b >= binsize(a) */
  if (SIGN(*a) == 0 || b >= binsize_a) {
    free_digits(res);
    SIGN(*res)   = 0;
    SIZE(*res)   = 0;
    DIGITS(*res) = NULL;
    return;
  }

  binsize_res = binsize_a - b;
  size_res = (binsize_res + BITS_IN_DIGIT - 1) / BITS_IN_DIGIT;

  /* adjust bn_res size */
  handle_res(size_res);

  shift_count = b % BITS_IN_DIGIT;

  p_digits = DIGITS(bn_res) + size_res;
  idx_res = size_res;

  if ( shift_count ) {
     /* first digit is particular as it can be 0 */
     shiftres = DIGIT(*a,SIZE(*a)-1) >> shift_count;
     if (shiftres != 0) {
        *--p_digits = shiftres;
        idx_res--;
     }
     incoming = DIGIT(*a,SIZE(*a)-1) << (BITS_IN_DIGIT - shift_count);
     for (idx = SIZE(*a) - 2; idx_res > 0; idx--, idx_res--) {
        shiftres = (DIGIT(*a,idx) >> shift_count) | incoming;
        *--p_digits = shiftres;
        incoming = DIGIT(*a,idx) << (BITS_IN_DIGIT - shift_count);
     }
  }
  else {
     /* shift_count == 0 */
     for (idx = SIZE(*a) - 1; idx_res > 0; idx--, idx_res--) {
        *--p_digits = DIGIT(*a,idx);
     }
  }

  /* keep the sign */
  SIGN(bn_res) = SIGN(*a);
  SIZE(bn_res) = size_res;
  normalize(res, &bn_res);
}

/* give reverse for 0..15 */
static unsigned int rev_table[] = {
   0x0000,
   0x0008,
   0x0004,
   0x000c,
   0x0002,
   0x000a,
   0x0006,
   0x000e,
   0x0001,
   0x0009,
   0x0005,
   0x000d,
   0x0003,
   0x000b,
   0x0007,
   0x000f
};

void bn_reverse_with_size(bignum_t *res, bignum_t *a, unsigned int a_binsize)
{
  unsigned int leading_bits;
  bignum_t     *tmp;
  unsigned int size_tmp;
  unsigned int digit_idx;
  digit_t      src;
  digit_t      dest;
  unsigned     char_idx;
  unsigned int last_idx;

  /* special case zero */
  if (SIGN(*a) == 0 ) {
    free_digits(res);
    SIGN(*res)   = 0;
    SIZE(*res)   = 0;
    DIGITS(*res) = NULL;
  }

  /* compute number of necessary digit_t for a_binsize */
  size_tmp = a_binsize / BITS_IN_DIGIT;
  leading_bits = a_binsize % BITS_IN_DIGIT;
  if ( leading_bits ) {
     size_tmp++;
  }
  /* create tmp bignum of right size */
  tmp = bn_create();
  alloc_digits(tmp, size_tmp);
  DIGITCLEAR(*tmp, size_tmp);
  DIGITCOPY(*tmp, *a);
  SIZE(*tmp) = size_tmp;
  SIGN(*tmp) = +1;

  /* algo:
   * if binsize(a) = n*BITS_IN_DIGIT, then simply reverse it
   * if binsize(a) = n*BITS_IN_DIGIT + p, then 
   *   tmp = a << (BITS_IN_DIGIT - p)
   * then do reverse tmp. Incoming O's after shift will be leading 0
   * that we don't care about for bitvectors
   */

  /* compute how many bits unused in leading digit */
  if ( leading_bits ) {
     /* tmp = a >> shift_amt, shift_amt = BITS_IN_DIGIT - leading_bits
      * so that all digits of tmp are fully used 
      */
     bn_lshift(tmp, tmp, BITS_IN_DIGIT - leading_bits);
  }

  /* adjust bn_res size */
  handle_res(size_tmp);
  SIZE(bn_res) = size_tmp;

  /* reverse each digit */
  last_idx = 0; /* index of last non null digit */
  for ( digit_idx = 0; digit_idx < size_tmp; digit_idx ++ ) {
     /* reverse src[n-1-i] into dest[i] */
     src = DIGIT(*tmp, size_tmp - 1 - digit_idx);
     dest = 0;
     if ( src ) {
        /* reverse each char, using reverse table.
           specialize initial case, to have correct number of shits
           for dest
        */
        dest = rev_table[src & 0xF];
        for (char_idx = 1; char_idx < sizeof(digit_t)*2; char_idx++) {
           dest <<= 4;
           src >>= 4;
           dest |= rev_table[src & 0xF];
        }
        /* non null digit */
        last_idx = digit_idx;
     }
     /* copy result */
     DIGIT(bn_res, digit_idx) = dest;
  }

  bn_free(tmp);
  /* fix size : it will remove leading 0's ! */
  SIZE(bn_res) = last_idx+1;
  /* sign ? */
  SIGN(bn_res) = +1;
  normalize(res, &bn_res);
}

/*****************************************************************************
 * I/O functions
 *****************************************************************************/

static unsigned char ascii_to_nb[256] = {
  /*0  1   2   3   4   5   6   7   8   9   A   B   C   D   E   F */
  255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255, /* 00 */
  255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255, /* 10 */
  255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255, /* 20 */
    0,  1,  2,  3,  4,  5,  6,  7,  8,  9,255,255,255,255,255,255, /* 30 */
  255, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, /* 40 */
   25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,255,255,255,255,255, /* 50 */
  255, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, /* 60 */
   25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,255,255,255,255,255, /* 70 */
  255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255, /* 80 */
  255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255, /* 90 */
  255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255, /* A0 */
  255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255, /* B0 */
  255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255, /* C0 */
  255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255, /* D0 */
  255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255, /* E0 */
  255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255  /* F0 */
};

int bn_set_str(bignum_t *nb, const char *str, unsigned int base)
{
  int                  sign;
  unsigned int         size;
  unsigned int         nb_base_digit;
  const unsigned char *str_group;
  unsigned int         leading_zeros;
  int                  base_power;
  unsigned int         value;

  base_power = is_a_power_of_2(base);

  if (base_power <= 0 && base != 10) {
    return -1;
  }

  /* read sign */
  if (*str == '-') {
    str++;
    sign = -1;
  } else {
    sign = +1;
  }

  /* skip leading '0' */
  leading_zeros = 0;
  while (*str == '0') {
    str++;
    leading_zeros++;
  }

  /* if we are at the end, we either have 0 or an error */
  if (*str == '\0') {
    if (leading_zeros != 0) {
      SIGN(*nb)   = 0;
      SIZE(*nb)   = 0;
      DIGITS(*nb) = NULL;
      return 0;
    } else {
      return -1;
    }
  }

  nb_base_digit = strlen(str);

  /* compute approximate number of digits */
  if (base_power > 0) {
    if ((nb_base_digit * base_power) % BITS_IN_DIGIT != 0) {
      size = (nb_base_digit * base_power) / BITS_IN_DIGIT + 1;
    } else {
      size = (nb_base_digit * base_power) / BITS_IN_DIGIT;
    }
  } else {
    /* base 10 */
    size = (unsigned int)(nb_base_digit * LOG2_10) / BITS_IN_DIGIT + 1;
  }
  alloc_digits(nb, size);

  /* init number with its last digit */
  value = ascii_to_nb[*(const unsigned char *)str];
  if (value >= base) {
    free_digits(nb);
    DIGITS(*nb) = NULL;
    return 1;
  }
  SIZE(*nb) = 1;
  DIGITCLEAR(*nb, size);
  DIGIT(*nb, 0) = value;

  /* read the number */
  for (str_group = (const unsigned char *)str + 1;
       str_group < (const unsigned char *)str + nb_base_digit;
       str_group++) {
    unsigned int value = ascii_to_nb[*str_group];
    if (value >= base) {
      free_digits(nb);
      DIGITS(*nb) = NULL;
      return 1;
    }
    unsigned_singlemul(nb, nb, base);
    unsigned_singleadd(nb, nb, value);
  }

  /* adjust size (works since size is not zero) */
  for (size-- ; size > 0 && DIGIT(*nb,size) == 0; size--) {
  }
  SIGN(*nb) = sign;
  SIZE(*nb) = size + 1;

  return 0;
}

char nb_to_ascii[37] = "0123456789abcdefghijklmnopqrstuvwxyz";

char *bn_get_str(char *str, unsigned int base, bignum_t *nb)
{
  unsigned int  size_in_base, nb_digits;
  char         *saved_str;
  char         *ptr_str;
  int           local_str;
  bignum_t     *temp;
  digit_t       rem;

  size_in_base = bn_sizeinbase(nb, base);
  if (size_in_base == 0) {
    return NULL;
  }

  if (str == NULL) {
    local_str = 1;
    str = ALLOCN(char, size_in_base + (SIGN(*nb) < 0 ? 2 : 1));
  } else {
    local_str = 0;
  }

  saved_str = str;

  if (SIGN(*nb) == 0) {
    *str++ = '0';
    *str = '\0';
    return saved_str;
  }

  if (SIGN(*nb) < 0) {
    *str++ = '-';
  }

  temp = bn_create();
  copy(temp, nb);

  nb_digits = 0;
  ptr_str = str + size_in_base;
  *ptr_str = '\0';
  do {
    unsigned_singlediv(temp, temp, base, 1, &rem);
    *--ptr_str = nb_to_ascii[rem];
    nb_digits++;
  } while (SIZE(*temp) != 0);

  bn_delete(temp);

  if (nb_digits != size_in_base) {
    /* the allocated string may be too big reduce it */
    char *real_str;

    if (local_str) {
      real_str = ALLOCN(char, nb_digits + (SIGN(*nb) < 0 ? 2 : 1));
    } else {
      real_str = saved_str;
    }
    if (SIGN(*nb) < 0) {
      *real_str = '-';
      MEMCOPY(real_str+1, ptr_str, nb_digits + 1);
    } else {
      MEMCOPY(real_str, ptr_str, nb_digits + 1);
    }
    if (local_str) {
      FREE(saved_str);
      saved_str = real_str;
    }
  }

  return saved_str;
}

int bn_out_str(FILE *out, unsigned int base, bignum_t *nb)
{
  char *str;

  str = bn_get_str(NULL, base, nb);
  if (str == NULL) {
    return -1;
  }
  fputs(str, out);
  FREE(str);
  return 0;
}

/* version */
char* bn_version() {
   static char buffer[32];
   sprintf(buffer, "BigNum (%s)", BN_VERSION);
   return buffer;
}

/* debug only */
void bn_check(FILE *out, bignum_t *a)
{
  unsigned int size, sign, i;

  size = SIZE(*a);
  sign = SIGN(*a);

  if (sign == 0 && size != 0) {
    fputs("??? sign is 0 but not size\n", out);
  }
  if (size == 0 && sign != 0) {
    fputs("??? size is 0 but not sign\n", out);
  }
  for (i = 0; i < size; i++) {
    if (DIGIT(*a,i) != 0) {
      break;
    }
  }
  if (i == size && size != 0) {
    if (size != 0 || sign != 0) {
      if (size == 0) {
	fputs("??? all digits are 0 but not sign\n", out);
      } else if (sign == 0) {
	fputs("??? all digits are 0 but not size\n", out);
      } else {
	fputs("??? all digits are 0 but not sign and size\n", out);
      }
    }
  }
  /* check leading digit not zero */
  if (size != 0 && DIGIT(*a,size-1) == 0) {
    fputs("??? leading digit is 0\n", out);
  }
}
