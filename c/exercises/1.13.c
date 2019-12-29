//
//  main.c
//  1.13
//
//  Created by Junhao Wang on 27/12/19.
//  Copyright © 2019 Junhao Wang. All rights reserved.
//

#include <stdio.h>

#define MAX_LENGTH 15
#define IN_WORD 1
#define OUT_WORD 0

int main(void)
{
    int c, word_in_out;
    int word_length[MAX_LENGTH + 1];
    int l;
    int i, j;
    unsigned int max_count;

    for (i = 0; i <= MAX_LENGTH; ++i)
        word_length[i] = 0;

    word_in_out = OUT_WORD;
    printf("Input some characters, then press Ctrl+D.\n");
    while (1) {
        c = getchar();
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            if (word_in_out == OUT_WORD) {
                l = 0;
                word_in_out = IN_WORD;
            }
            ++l;
        } else {
            if (word_in_out == IN_WORD) {
                if (l <= MAX_LENGTH)
                    ++word_length[l - 1];
                else
                    ++word_length[MAX_LENGTH];
                word_in_out = OUT_WORD;
            }
            if (c == EOF)
                break;
        }
    }

}
