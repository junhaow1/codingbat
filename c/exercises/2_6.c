//
//  main.c
//  2.6
//
//  Created by Junhao Wang on 4/1/20.
//  Copyright © 2020 Junhao Wang. All rights reserved.
//

#include <stdio.h>

unsigned setbits(unsigned x, int p, int n, unsigned y);

int main(void)
{
    printf("%u\n", setbits(5732, 6, 3, 9823));
    return 0;
}

unsigned setbits(unsigned x, int p, int n, unsigned y)
{
    // xxxxx00000xxxxx
    unsigned a = x & ~(~(~0U << n) << (p + 1 - n));

    // 00000yyyyy00000
    unsigned b = (y & ~(~0U << n)) << (p + 1 - n);

    // xxxxxyyyyyxxxxx
    return a | b;
}
