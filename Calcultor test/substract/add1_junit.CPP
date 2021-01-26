#include<iostream>
#include<fstream>
using namespace std;


//right function for testing grades
int add(int a, int b, int c) {
		return a+b+c;
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
	int id,a,b,c;
	if(readFile("worst.csv",ifile) && openFile("methods.java",ofile) && openFile("worst_data.csv",ofileresult)){
	//cout<<id<<" calling"<<endl; 
	
		while(ifile>>id>>ch>>a>>ch>>b>>ch>>c){
			ofile<<"@Test\n";
			ofile<<"public void add_three_parameter_worstCase"<<id<<" () {"<<endl;
			ofile<<"\tCaculator c = new Caculator();"<<endl;
			ofile<<"\tint result = c.add("<<a<<","<<b<<","<<c<<");"<<endl;
			ofile<<"\tint expected = "<<add(a,b,c)<<";"<<endl;
			ofile<<"\tassertEquals(expected,result);"<<endl;
			ofile<<"}"<<endl;
			
			ofileresult<<id<<","<<a<<","<<b<<","<<c<<","<<add(a,b,c)<<","<<add(a,b,c)<<","<<"Success"<<endl;
			
		}
	}
	
	
}
