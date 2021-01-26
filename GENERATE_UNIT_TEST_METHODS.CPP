#include<iostream>
#include<fstream>
using namespace std;


//right function for testing grades
string getGradeExpectedValue(int mid, int ct, int finalExam, int attendance) {
	int total = mid+ct+finalExam+attendance;
	string grade = "";
	if(total >= 80) {
		grade = "A+";
	}
	else if(total >=70) {
		grade = "A";
	}
	else if (total >= 60) {
		grade = "B";
	}
	else if (total >= 50) {
		grade = "C";
	}
	else if (total <= 50) {
		grade = "F";
	}
	return grade;
}	
string getGradeValue(int mid, int ct, int finalExam, int attendance) {
	int total = mid+ct+finalExam+attendance;
	string grade = "";
	if(total >= 80) {
		grade = "A+";
	}
	if(total >=70) {
		grade = "A";
	}
	if (total >= 60) {
		grade = "B";
	}
	if (total >= 50) {
		grade = "C";
	}
	if (total <= 50) {
		grade = "F";
	}
	return grade;
}

bool openFile(string fileName,ofstream &ofile){
	ofile.open(fileName);
	if(!ofile.is_open()) {
		cout<<"problem"<<endl;
		return false;
	};
	return true;
}
bool readFile(string fileName,ifstream &ifile){
	ifile.open(fileName);
	if(!ifile.is_open()) {
		cout<<"problem in reading"<<endl;
		return false;
	};
	return true;
}

int main(){
	ifstream ifile;
	ofstream ofile,ofileresult;
	
	char ch;
	string s;
	int id,mid,ct,finel,att;
	if(readFile("worst.csv",ifile) && openFile("methods.java",ofile) && openFile("data.csv",ofileresult)){
	//cout<<id<<" calling"<<endl; 
	
		while(ifile>>id>>ch>>mid>>ch>>ct>>ch>>finel>>ch>>att){
			ofile<<"@Test\n";
			ofile<<"public void getGradeTestWorstCase"<<id<<" () {"<<endl;
			ofile<<"\tGradeCalculator gc= new GradeCalculator();"<<endl;
			ofile<<"\tString grade = gc.getGrade("<<mid<<","<<ct<<","<<finel<<","<<att<<");"<<endl;
			ofile<<"\tString expected = \"Z\";"<<endl;
			ofile<<"\tassertEquals(expected,grade);"<<endl;
			ofile<<"}"<<endl;
			
			ofileresult<<id<<","<<mid<<","<<ct<<","<<finel<<","<<att<<","<<"Z"<<","<<getGradeValue(mid,ct,finel,att)<<","<<"Fail"<<endl;
			
		}
	}
	
	
}
