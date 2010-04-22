#ifndef BIGNUM_H
#define BIGNUM_H

#include <stdio.h>

struct bignum_s;
typedef struct bignum_s bignum_t;

#ifdef __cplusplus
extern "C" {
#endif
char* bn_version();

/* bn management */
bignum_t    *bn_create(void);
void         bn_delete(bignum_t *bn);
/* operations */
int          bn_cmp(bignum_t *a, bignum_t *b);
void         bn_neg(bignum_t *res, bignum_t *a);
int          bn_sgn(bignum_t *a);
void         bn_abs(bignum_t *res, bignum_t *a);
void         bn_add(bignum_t *res, bignum_t *a, bignum_t *b);
void         bn_add_ui(bignum_t *res, bignum_t *a, unsigned int b);
void         bn_sub(bignum_t *res, bignum_t *a, bignum_t *b);
void         bn_sub_ui(bignum_t *res, bignum_t *a, unsigned int b);
void         bn_mul(bignum_t *res, bignum_t *a, bignum_t *b);
int          bn_div(bignum_t *res, bignum_t *a, bignum_t *b);
int          bn_rem(bignum_t *res, bignum_t *a, bignum_t *b);
int          bn_pow(bignum_t *res, bignum_t *a, bignum_t *b);
int          bn_pow_ui(bignum_t *res, bignum_t *a, unsigned int b);
unsigned int bn_binsize(bignum_t *a);
void         bn_binsize_bn(bignum_t *res, bignum_t *a);
unsigned int bn_sizeinbase(bignum_t *a, unsigned int base);
int          bn_fits_sint_p(bignum_t *a);
int          bn_fits_uint_p(bignum_t *a);
/* bit manipulation functions */
void         bn_setbit(bignum_t *a, unsigned int n);
void         bn_clrbit(bignum_t *a, unsigned int n);
int          bn_tstbit(bignum_t *a, unsigned int n);
/* logical functions */
void         bn_and(bignum_t *res, bignum_t *a, bignum_t *b);
void         bn_ior(bignum_t *res, bignum_t *a, bignum_t *b);
void         bn_xor(bignum_t *res, bignum_t *a, bignum_t *b);
void         bn_com(bignum_t *res, bignum_t *a);
void         bn_not_with_size(bignum_t *res, bignum_t *a, unsigned int b);
void         bn_lshift(bignum_t *res, bignum_t *a, unsigned int b);
void         bn_rshift(bignum_t *res, bignum_t *a, unsigned int b);
void         bn_reverse_with_size(bignum_t *res, bignum_t *a, unsigned a_binsize);
/* I/O */
bignum_t    *bn_init_set(bignum_t *a);
bignum_t    *bn_init_set_ui(unsigned int b);
bignum_t    *bn_init_set_si(int b);
bignum_t    *bn_init_set_str(const char *str, unsigned int base);
int          bn_set_str(bignum_t *nb, const char *str, unsigned int base);
void         bn_set(bignum_t *res, bignum_t *a);
void         bn_set_ui(bignum_t *res, unsigned int b);
void         bn_set_si(bignum_t *res, int b);
int          bn_out_str(FILE *out, unsigned int base, bignum_t *nb);
char        *bn_get_str(char *str, unsigned int base, bignum_t *nb);
unsigned int bn_get_ui(bignum_t *a);
int          bn_get_si(bignum_t *a);
/* debug only */
void         bn_check(FILE *out, bignum_t *a);

#ifdef __cplusplus
}
#endif

#endif /* !BIGNUM_H */
