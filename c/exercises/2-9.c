//
//  main.c
//  2.9
//
//  Created by Junhao Wang on 4/1/20.
//  Copyright © 2020 Junhao Wang. All rights reserved.
//

#include <stdio.h>

int bitcount(unsigned x);

int main(void)
{
    printf("%d\n", bitcount(011111));
    return 0;
}

/* bitcount: count 1 bits in x */
int bitcount(unsigned x)
{
    int b;

    for (b = 0; x != 0; x &= (x - 1))
        b++;
    return b;
}

