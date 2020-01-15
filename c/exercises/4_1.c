//
//  main.c
//  4.1
//
//  Created by Junhao Wang on 15/1/20.
//  Copyright © 2020 Junhao Wang. All rights reserved.
//

#include <stdio.h>
#include <string.h>

#define MAXLINE 1000

int getchars(char s[], int max);
int strindex(char source[], char searchfor[]);

int main(void)
{
    char source[MAXLINE];
    char pattern[MAXLINE];

    printf("Input source, then press enter:\n");
    while (getchars(source, MAXLINE) == 0)
        ;

    printf("Input pattern, then press enter:\n");
    while (getchars(pattern, MAXLINE) == 0)
        ;

    printf("The position is: %d\n", strindex(source, pattern));

    return 0;
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

int strindex(char s[], char t[])
{
    int i,j,k,pos;
    pos = -1;
    for (i = 0 ; s[i]!= '\0'; i++){
        for (j = i,k=0; t[k] != '\0' && s[j] == t[k];j++,k++)
            ;
        if (k>0 && t[k] == '\0')
            pos = i;
    }
    
    return pos;

}
