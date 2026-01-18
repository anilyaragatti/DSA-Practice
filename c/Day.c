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
