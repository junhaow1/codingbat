//
//  main.c
//  1.8
//
//  Created by Junhao Wang on 27/12/19.
//  Copyright © 2019 Junhao Wang. All rights reserved.
//

#include <stdio.h>

int main(void)
{
    int c, bl, tl, nl;
    bl = 0;
    tl = 0;
    nl = 0;

    printf("Input some characters, then press Ctrl+D.\n");
    while ((c = getchar()) != EOF)
        if (c == ' ')
            ++bl;
        else if (c == '\t')
            ++tl;
        else if (c == '\n')
            ++nl;

    printf("Count of blanks is %d, count of tabs is %d, count of newlines is %d.\n", bl, tl, nl);

    return 0;
}
