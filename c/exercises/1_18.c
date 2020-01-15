//
//  main.c
//  1.18
//
//  Created by Junhao Wang on 27/12/19.
//  Copyright © 2019 Junhao Wang. All rights reserved.
//

#include <stdio.h>

#define MAXLINE 1000

int get_line(char line[], int maxline);
int remove1(char s[]);

int main(void)
{
    int len; /* current line length */
    char line[MAXLINE]; /* current input line */

    while ((len = get_line(line, MAXLINE)) > 0) {
        if (remove1(line)>0)
            printf("%s\n", line);

    }

    return 0;
}

int get_line(char s[], int lim)
{
    int c, i, l;

    for (i = 0, l = 0; (c = getchar()) != EOF && c != '\n'; ++i)
        if (i < lim - 1)
            s[l++] = c;
    if (c == '\n' && l < lim - 1)
        s[l++] = c;
    s[l] = '\0';

    return l;
}



int   remove1(char s[])
{
    int i;
    i = 0;
    while(s[i] != '\n')
        ++i;
    --i;
    while(i>=0 && (s[i]==' ' || s[i] == '\t'))
        --i;
    if (i>=0){
        ++i;
        s[i] = '\n';
        ++i;
        s[i] = '\0';
    }
    return i;
    
}

