//
//  main.c
//  1.12
//
//  Created by Junhao Wang on 27/12/19.
//  Copyright © 2019 Junhao Wang. All rights reserved.
//

#include <stdio.h>

int main(void)
{
    int c, linestarted;

    linestarted = 0;
    printf("Input some characters, then press Ctrl+D.\n");
    while ((c = getchar()) != EOF)
        if (c == ' ' || c == '\t' || c == '\n') {
            if (!linestarted) {
                putchar('\n');
                linestarted = 1;
            }
        } else {
            putchar(c);
            linestarted = 0;
        }

    return 0;
}
