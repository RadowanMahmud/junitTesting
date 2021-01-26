#include<iostream>
#include<fstream>
#include<vector>
#include<queue>
using namespace std;
int n,count=0,id = 10000;
struct Case{
	int min;
	int max;
	int close_to_min;
	int close_to_max;
	int nom;
};
vector<vector<int>> test_cases;
vector<int> output;

void value_input(int value){
		output.push_back(value);
		test_cases.push_back(output);	
		output.pop_back();
}


int print_test_cases(int id){
 	ofstream MyFile("worst.csv");

	for(int i=0;i<test_cases.size();i++){
		MyFile<<id++<<", ";
		for(int j=0;j<test_cases[i].size();j++){
			if(j==test_cases[i].size()-1){
				MyFile<<test_cases[i][j]<<endl;
			}
			else MyFile<<test_cases[i][j]<<",";
		}
	}
	return id;
}
void worst_case(queue<Case> tvec){
	queue<Case> temp;
	temp=tvec;

	if(tvec.size()==1){
		value_input(tvec.front().min);
		value_input(tvec.front().close_to_min);
		value_input(tvec.front().nom);
		value_input(tvec.front().close_to_max);
		value_input(tvec.front().max);
			
		return;
	}
	else{
		output.push_back(tvec.front().min);
		temp.pop();
		worst_case(temp);
		temp=tvec;
		output.pop_back();
		
		output.push_back(tvec.front().close_to_min);
		temp.pop();
		worst_case(temp);
		temp=tvec;
		output.pop_back();
		
		output.push_back(tvec.front().nom);
		temp.pop();
		worst_case(temp);
		temp=tvec;
		output.pop_back();
		
		output.push_back(tvec.front().close_to_max);
		temp.pop();
		worst_case(temp);
		temp=tvec;
		output.pop_back();
		
		output.push_back(tvec.front().max);
		temp.pop();
		worst_case(temp);
		temp=tvec;
		output.pop_back();
		
		
		return;	
	}
}


int main(){
	cin>>n;
	queue<Case> boundaries;
	for(int i=0;i<n;i++){
		Case temp;
		cin>>temp.min>>temp.max;
		temp.close_to_min = temp.min+1;
		temp.close_to_max = temp.max-1;
		temp.nom =(temp.min+temp.max)/2;
		boundaries.push(temp);
	}
	
	worst_case(boundaries);
	print_test_cases(1);

}
