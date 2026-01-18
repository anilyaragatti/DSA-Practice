#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Day
{
    /* data */
    char *name;
    int date;
    char *activity;
};

struct Day createDay()
{
    /* data */
    struct Day day;
    day.name = (char *)malloc(20 * sizeof(char));
    printf("Enter the name of the day");
    scanf("%s", &day.name);
    printf("Enter the date of the day");
    scanf("%s", &day.date);
    day.activity = (char *)malloc(100 * sizeof(char));
    printf("Enter the activity of the day");
    scanf("%s",day.activity);
    return day;
};

void read(struct Day calender[7]){
    int numDay = 0;
    while (numDay<7){
        printf("Enter datails for day %d", numDay+1);
        struct Day newDay = createDay();
        calender[numDay] = newDay;
        numDay++;
    }   
}

void display(struct Day calender[7]){
    printf("calendar for week:");
    for(int i=0;i<7;i++){
        printf("Day %d: %s, Date: %d", i+1,calender[i].name,calender[i].date);
        printf("activity %s: ", calender[i].activity);

    }
}

int main(){
    struct Day calender[7];
    printf('create a calendar for week');
    read(calender);
    display(calender);
    return 0;

}