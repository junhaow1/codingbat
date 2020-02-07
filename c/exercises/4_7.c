//
//  main.c
//  4.7
//
//  Created by Junhao Wang on 15/1/20.
//  Copyright © 2020 Junhao Wang. All rights reserved.
//

#include <stdio.h>
#include <string.h>

int getch(void);
void ungetch(int);
void ungets(char s[]);

int main(void)
{
    ungets("testring");
    putchar(getch());
    putchar(getch());
    putchar(getch());
    putchar(getch());
    putchar(getch());
    putchar(getch());
    putchar(getch());
    putchar(getch());

    return 0;
}

#define BUFSIZE 100

char buf[BUFSIZE]; /* buffer for ungetch */
int bufp = 0; /* next free position in buf */

int getch(void) /* get a (possibly pushed-back) character */
{
    return (bufp > 0) ? buf[--bufp] : getchar();
}

void ungetch(int c) /* push character back on input */
{
    if (bufp >= BUFSIZE)
        printf("ungetch: too many characters\n");
    else
        buf[bufp++] = c;
}

void ungets(char s[])
{
  int l = strlen(s);

  while (l)
    ungetch(s[--l]);
}
