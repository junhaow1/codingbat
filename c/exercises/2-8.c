//
//  main.c
//  2.8
//
//  Created by Junhao Wang on 4/1/20.
//  Copyright © 2020 Junhao Wang. All rights reserved.
//

#include <stdio.h>

unsigned rightroc(unsigned x, int n);

int main(void)
{
    printf("%u\n", rightroc(5732, 3));
    return 0;
}

unsigned rightroc(unsigned x, int n)
{
    while (n-- > 0)
        if(x & 1)
            x = (x >> 1) | ~(~0U >> 1);
        else
            x = x >> 1;
    return x;
}
