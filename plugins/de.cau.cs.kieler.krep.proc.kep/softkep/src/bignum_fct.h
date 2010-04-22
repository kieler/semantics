#ifndef BIGNUM_FCT_H
#define BIGNUM_FCT_H

#include "bignum.h"

#define bn_abs_fct(res, a) (bn_abs(res, a), res)
#define bn_neg_fct(res, a) (bn_neg(res, a), res)
#define bn_add_fct(res, a, b) (bn_add(res, a, b), res)
#define bn_add_ui_fct(res, a, b) (bn_add_ui(res, a, b), res)
#define bn_sub_fct(res, a, b) (bn_sub(res, a, b), res)
#define bn_sub_ui_fct(res, a, b) (bn_sub_ui(res, a, b), res)
#define bn_mul_fct(res, a, b) (bn_mul(res, a, b), res)
#define bn_div_fct(res, a, b) (bn_div(res, a, b), res)
#define bn_rem_fct(res, a, b) (bn_rem(res, a, b), res)
#define bn_pow_fct(res, a, b) (bn_pow(res, a, b), res)
#define bn_pow_ui_fct(res, a, b) (bn_pow_ui(res, a, b), res)
#define bn_set_si_fct(res, a) (bn_set_si(res, a), res)
#define bn_set_ui_fct(res, a) (bn_set_ui(res, a), res)
#define bn_set_fct(res, a) (bn_set(res, a), res)
#define bn_set_str_fct(res, str, base) (bn_set_str(res, str, base), res)
#define bn_and_fct(res, a, b) (bn_and(res, a, b), res)
#define bn_ior_fct(res, a, b) (bn_ior(res, a, b), res)
#define bn_xor_fct(res, a, b) (bn_xor(res, a, b), res)
#define bn_not_with_size_fct(res, a, bs) (bn_not_with_size(res, a, bs), res)
#define bn_lshift_fct(res, a, bs) (bn_lshift(res, a, bs), res)
#define bn_rshift_fct(res, a, bs) (bn_rshift(res, a, bs), res)
#define bn_reverse_with_size_fct(res, a, bs) (bn_reverse_with_size(res, a, bs), res)

#endif /* !BIGNUM_FCT_H */
