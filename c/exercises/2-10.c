//
//  main.c
//  2.10
//
//  Created by Junhao Wang on 4/1/20.
//  Copyright © 2020 Junhao Wang. All rights reserved.
//

#include <stdio.h>

int lower(int c);

int main(void)
{
    char s[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int i;

    i = 0;
    while (s[i] != '\0') {
        printf("%c -> %c\n", s[i], lower(s[i]));
        i++;
    }

    return 0;
}

int lower(int c)
{
    return (c >= 'A' && c<= 'Z') ? c + 'a' - 'A' : c;
}
