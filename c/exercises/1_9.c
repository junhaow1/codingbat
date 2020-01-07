//
//  main.c
//  1.9
//
//  Created by Junhao Wang on 27/12/19.
//  Copyright © 2019 Junhao Wang. All rights reserved.
//

#include <stdio.h>

int main(void)
{
    int c, blank_recieved;
    blank_recieved = 0;
    printf("Input some characters, when you finishes, press Ctrl+D.\n");
    while ((c = getchar()) != EOF)
        if (c == ' ') {
            if (!blank_recieved) {
                blank_recieved = 1;
                putchar(c);
            }
        } else {
            blank_recieved = 0;
            putchar(c);
        }

    return 0;
}
