//
//  main.c
//  3.1
//
//  Created by Junhao Wang on 11/1/20.
//  Copyright © 2020 Junhao Wang. All rights reserved.
//

#include <stdio.h>

int binsearch(int x, int v[], int n);

int main(void)
{
    int x = 12, n = 10;
    int v[10] = {2, 3, 7, 10, 11, 12, 15, 18, 20, 21};
    printf("binsearch result: %d\n", binsearch(x, v, n));
    return 0;
}

/* binsearch: find x in v[0] <= v[1] <= ... <= v[n-1] */
int binsearch(int x, int v[], int n)
{
    int low, high, mid;

    low = 0;
    high = n - 1;
    mid = (low + high) / 2;
    while (low <= high && x != v[mid]) {
  
        if (x < v[mid])
            high = mid-1;
        else
            low = mid + 1;
        
        mid = (low + high) / 2;

    }
    return (x == v[mid]) ? mid : -1;
}
