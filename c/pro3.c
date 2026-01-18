#include<stdio.h>
#include<stdlib.h>
#define MAX 5

int stack[MAX];
int top=-1;

void push(int element){
    if(top==MAX-1){
        printf("stack is overflw");
    }else{
        stack[++top]=element;
        printf("%d id pushed onto stack",element);
    }
}

int pop(){
    if(top==-1){
        printf("stack is undeerflow");
        return -1;
    }else{
        int popped = stack[top--];
        printf("popped");
        return popped;

    }
}

void display(){
    if(top==-1){
        printf("stack is undeerflow");
    }else{
        printf("stacks elemets are ");
        for(int i=top;i>=0;i++){
            printf("%d",stack[i]);
        }
    }
}

void checkpalindrom(){
    int num,original,reversed=0,digit;
    int tempStack[MAX];
    int temptop=-1;

    printf("Enter the number to check for palindrome ");
    scanf("%d",&num);

    if(num<0){
        printf("nagative num are not consider for palindrome");
        return;
    }

    original=num;
    while (num!=0){
        digit=num/10;
        tempStack[++temptop]=digit;
        num/=10;
        
    }

    for (int i = 0; i <=temptop; i++)
    {
        reversed=reversed*10+tempStack[i];
    }
    
    
    


}