#include <iostream>
#include <vector>
using namespace std;
int main() {
    vector<string> estudiantes;
    estudiantes.push_back("Victor");
    estudiantes.push_back("Maria");
    estudiantes.push_back("Luis");
    estudiantes.push_back("Ana");
    estudiantes.push_back("Pedro");
    for(int i = 0; i < estudiantes.size(); i++) {
        cout << "Estudiante " << i+1 << ": " << estudiantes[i] << "\n";
    }
    return 0;
}
