//
//  main.c
//  4.13
//
//  Created by Junhao Wang on 15/1/20.
//  Copyright © 2020 Junhao Wang. All rights reserved.
//

#include <stdio.h>
#include <string.h>

#define MAXLINE 1000

int getchars(char line[], int max);
void reverse(char s[]);
void reverse_r(char s[], int i, int j);

int main(void)
{
    char s[MAXLINE];

    while (getchars(s, MAXLINE)) {
        reverse(s);
        printf("reverse: %s\n", s);
    }

    return 0;
}

void reverse(char s[])
{
    reverse_r(s, 0, strlen(s) - 1);
}

void reverse_r(char s[], int i, int j)
{
    int tmp;

    tmp = s[i];
    s[i] = s[j];
    s[j] = tmp;

    if (i < j)
        reverse_r(s, ++i, --j);
}

int getchars(char s[], int max)
{
    int c, i, l;

    for (i = 0, l = 0; (c = getchar()) != EOF && c != '\n'; ++i)
        if (i < max - 1)
            s[l++] = c;
    s[l] = '\0';

    return l;
}
