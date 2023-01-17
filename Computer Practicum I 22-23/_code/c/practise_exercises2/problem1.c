#include<stdio.h>

int main(){

    int n, eden=0, nula=0;
    scanf("%d",&n);
    int a[n];
    for (int i = 0; i < n; i++){
        scanf("%d", &a[i]);
        if(a[i]==1)
            eden++;
        else if(a[i]==0)
            nula++;
    }
    if(nula==0)
        printf("%d\n", 0);
    else if(nula>=eden)
        printf("%d\n", 0);
    else
        printf("%d\n", eden-nula);

    return 0;

    
    
}