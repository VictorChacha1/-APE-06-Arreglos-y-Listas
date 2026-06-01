#include <iostream>
#include <vector>
using namespace std;
class Alumno {
public: string nombre; double nota;
    Alumno(string n, double p) : nombre(n), nota(p) {}
};
int main() {
    vector<Alumno> clase;
    clase.push_back(Alumno("Victor", 9.5));
    clase.push_back(Alumno("Maria", 8.0));
    for(Alumno a : clase) cout << a.nombre << " - " << a.nota << "\n";
    return 0;
}
