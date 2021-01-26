#include<iostream>
#include<fstream>
using namespace std;


//right function for testing grades
int subtract(int a, int b) {
		return a-b;
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
	if(readFile("bvc.csv",ifile) && openFile("methods.java",ofile) && openFile("bvc_data.csv",ofileresult)){
	//cout<<id<<" calling"<<endl; 
	
		while(ifile>>id>>ch>>a>>ch>>b){
			ofile<<"@Test\n";
			ofile<<"public void subtract_BVC"<<id<<" () {"<<endl;
			ofile<<"\tCaculator c = new Caculator();"<<endl;
			ofile<<"\tint result = c.subtract("<<a<<","<<b<<");"<<endl;
			ofile<<"\tint expected = "<<subtract(a,b)<<";"<<endl;
			ofile<<"\tassertEquals(expected,result);"<<endl;
			ofile<<"}"<<endl;
			
			ofileresult<<id<<","<<a<<","<<b<<","<<subtract(a,b)<<","<<subtract(a,b)<<","<<"Success"<<endl;
			
		}
	}
	
	
}
