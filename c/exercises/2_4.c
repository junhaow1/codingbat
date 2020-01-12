//
//  main.c
//  2.4
//
//  Created by Junhao Wang on 2/1/20.
//  Copyright © 2020 Junhao Wang. All rights reserved.
//

#include <stdio.h>

#define MAXLINE 1000

int get_line(char line[], int maxline);
void squeeze(char s1[], char s2[]);

int main(void)
{
    int len;
    char s1[MAXLINE];
    char s2[MAXLINE];

    printf("Input string s1:\n");
    while ((len = get_line(s1, MAXLINE)) == 0)
        ;

    printf("Input string s2:\n");
    while ((len = get_line(s2, MAXLINE)) == 0)
        ;

    squeeze(s1, s2);
    printf("Result is %s\n", s1);

    return 0;
}

int get_line(char s[], int lim)
{
    int c, i, l;

    for (i = 0, l = 0; (c = getchar()) != EOF && c != '\n'; ++i)
        if (i < lim - 1)
            s[l++] = c;
    s[l] = '\0';

    return l;
}

/* something wrong here*/
void squeeze(char s1[], char s2[])
{
    int i, j, k;

    for(i=k=0;s1[i]!='\0';i++ ){
        for (j=0;s2[j]!='\0' && s2[j] !=s1[i];j++ )
            ;
        if(s2[j] == '\0' ){
            s1[k++] = s1[i];
        }
            
    }
    s1[k] = '\0';
}

/* This implementation is a bit more complicated*/
//void squeeze(char s1[], char s2[])
//{
//    int i, j, k;
//
//    i = 0;
//    while (s2[i] != '\0') {
//        j = 0;
//        while (s1[j] != '\0') {
//            if (s1[j] == s2[i]) {
//                k = j;
//                while ((s1[k] = s1[++k]) != '\0')
//                    ;
//            } else
//                ++j;
//        }
//        ++i;
//    }
//}
