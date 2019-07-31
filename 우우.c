#include <stdio.h>
#include <Windows.h>
#include <string>
#include <string.h>

void dictionary(int a);

void dictionary(int a)
{
	SYSTEMTIME st;
	GetLocalTime(&st);
	printf("오늘은 %d월 %d일 입니다.\n", st.wMonth, st.wDay);

	/* day 몇을 선택했는지 알려주는거 구현,,,*/
	if (a == 1)
	{
		char buffer[500];

		FILE* file = fopen("day1_5.txt", "r");

		if (file == NULL)
			puts("파일열기 오류");

		while (!feof(file))
		{
			fgets(buffer, sizeof(buffer), file);
			printf("%s\n", buffer);
		}

		fclose(file);
	}
	else if (a == 2)
	{
		char buffer[500];

		FILE* file = fopen("day6_10.txt", "r");

		if (file == NULL)
			puts("파일열기 오류");

		while (!feof(file))
		{
			fgets(buffer, sizeof(buffer), file);
			printf("%s\n", buffer);
		}

		fclose(file);
	}
	else if (a == 3)
	{
		char buffer[500];

		FILE* file = fopen("day11_15.txt", "r");

		if (file == NULL)
			puts("파일열기 오류");

		while (!feof(file))
		{
			fgets(buffer, sizeof(buffer), file);
			printf("%s\n", buffer);
		}

		fclose(file);
	}
	else if (a == 4)
	{
		char buffer[500];

		FILE* file = fopen("day16_20.txt", "r");

		if (file == NULL)
			puts("파일열기 오류");

		while (!feof(file))
		{
			fgets(buffer, sizeof(buffer), file);
			printf("%s\n", buffer);
		}

		fclose(file);
	}
	else if (a == 5)
	{
		char buffer[500];

		FILE* file = fopen("day21_25.txt", "r");

		if (file == NULL)
			puts("파일열기 오류");

		while (!feof(file))
		{
			fgets(buffer, sizeof(buffer), file);
			printf("%s\n", buffer);
		}

		fclose(file);
	}
	else if (a == 6)
	{
		char buffer[500];

		FILE* file = fopen("day26_30.txt", "r");

		if (file == NULL)
			puts("파일열기 오류");

		while (!feof(file))
		{
			fgets(buffer, sizeof(buffer), file);
			printf("%s\n", buffer);
		}

		fclose(file);
	}
	else if (a == 7)
	{
	char buffer[500];

	FILE* file = fopen("allday.txt", "r");

	if (file == NULL)
		puts("파일열기 오류");

	while (!feof(file))
	{
		fgets(buffer, sizeof(buffer), file);
		printf("%s\n", buffer);
	}
	fclose(file);
	}
}