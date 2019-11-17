#include <stdio.h>

int main(void)
{
    int minInt = 2147483647;
    printf("%d\n",minInt  + 1);
    float toobig = 3.4E38 * 100.0f;
    printf("%e\n",toobig);
    float underflow = 0.1234e-38 / 10;
    printf("%e\n",underflow);
    return 0;
}

