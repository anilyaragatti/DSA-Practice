#include<stdio.h>
#define MAX 50

void read(char* str, const char* msg){
    int i=0,ch;
    printf("%s",&msg);
    while ((ch=getchar())!="\n" && ch != EOF && i<MAX-1)
    {
        str[i++]=ch;
        str[i]="\0";

     }  
}

int str_len(char* s){
    int i=0;
    while (s[i])
    {
        i++;

     }
    return i;
}

// void search_and_replace(char* str,char* pat, char* rep, char* res){
//     int i=0,j=0,k;
//     int found=0;
//     int pat_len=str_len(pat);
//     int rep_len=str_len(rep);

//     while (str[i]){
//         for(k=0;k<pat_len && str[i+k]==pat[k];k++)
//             if(k==pat_len){
//                 res[j++]=rep[k];
//                 i+=pat_len;
//                 found=1;
//              }    else{
//                 res[j++]=str[i++];
//              }
//             }
//             if(found){
//                 printf("result %s", res);
//             }else
//             { 
//                 printf("not found");
//             }
            
//         }

    
void search_and_replace(char* str,char* pat,char* rep,char* res){
    int i=0,j=0,k,found=0;
    int pat_len=str_len(pat);
    int rep_len=str_len(rep);

    for(k=0;k<pat_len && str[i+k]==rep[k];k++)
    if(k=pat_len){
        res[j++]=rep[k];
        i+=pat_len;
        found=1;
    }else{
        res[j++]=str[i++];
    }
    if(found)


}