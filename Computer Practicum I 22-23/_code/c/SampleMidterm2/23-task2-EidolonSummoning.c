#include <stdio.h>

int main(){
    int dYears;
    printf("Which year is it: ");
    scanf("%d", &dYears);

    if(dYears%6==0)
        printf("Phoenix has come forth! - wish for health!\n");
    if(dYears%50==0)
        printf("Bahamut has come forth! - Wish for wisdom!\n");
    
    if(dYears%6==0 && dYears-18 <= dYears-(dYears%10))
        printf("Leviathan has come forth! - Wish for peace!\n");
    
    return 0;
}