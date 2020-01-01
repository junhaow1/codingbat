//
//  main.c
//  2.2
//
//  Created by Junhao Wang on 31/12/19.
//  Copyright © 2019 Junhao Wang. All rights reserved.
//

#include <stdio.h>

#define MAXLINE 1000

int main(void)
{
    char line[MAXLINE];
    int c, i;

    i = 0;
    while (i < MAXLINE - 1) {
    if ((c=getchar()) == EOF)
        break;
    line[i++] = c;
    if (c == '\n')
        break;
    }
    line[i] = '\0';

    printf("%s\n", line);

    return 0;
}
