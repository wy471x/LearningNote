#include <func.h>
void br()
{
    printf("Brazil,Russia");
}
void ic()
{
    printf("India,China");
}
int main()
{
    br();
    printf(",");
    ic();
    printf("\n");
    ic();
    printf(",\n");
    br();
    printf("\n");
    return 0;
}

