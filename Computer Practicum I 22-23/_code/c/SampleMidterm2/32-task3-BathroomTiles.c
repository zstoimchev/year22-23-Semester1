#include <stdio.h>

int main(){
    int dN, dM;
    int dSum=0;
    scanf("%d%d", &dN, &dM);
    
    if(dN==dM){
        for (int i = 1; i <= dN; i++)
        {
            dSum += i*i;
        }
        
    } 
    else{
        while(dN>0 || dM>0){
            dSum+=dN*dM;
            dN--;
            dM--;
        }
    }

    printf("%d\n", dSum);


	return 0;
}
