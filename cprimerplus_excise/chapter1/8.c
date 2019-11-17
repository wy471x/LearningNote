#include <func.h>
void two();
void one_three(){
    printf("one\n");
    two();
    printf("three\n");
}
void two(){
    printf("two\n");
}
int main(void)
{
    printf("Starting now:\n");
    one_three();
    printf("done!\n");
    return 0;
}

