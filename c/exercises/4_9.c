//
//  main.c
//  4.9
//
//  Created by Junhao Wang on 15/1/20.
//  Copyright © 2020 Junhao Wang. All rights reserved.
//

#include <stdio.h>

int getch(void);
void ungetch(int);

int main(void)
{
    ungetch('t');
    ungetch(EOF);
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
    else if (c != EOF)
        buf[bufp++] = c;
}
