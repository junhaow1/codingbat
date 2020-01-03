//
//  main.c
//  1.5
//
//  Created by Junhao Wang on 27/12/19.
//  Copyright © 2019 Junhao Wang. All rights reserved.
//

#include <stdio.h>

int main(void)
{
    float fahr, celsius;
    float lower, upper, step;

    lower = 0; /* lower limit of temperatuire scale */
    upper = 300; /* upper limit */
    step = 20; /* step size */

    printf("  F      C\n");

    fahr = upper;
    while (fahr >= lower) {
        celsius = (5.0 / 9.0) * (fahr - 32.0);
        printf("%3.0f %6.1f\n", fahr, celsius);
        fahr = fahr - step;
    }
    return 0;
}
