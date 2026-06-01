#include <iostream>
#include <vector>
using namespace std;
int main() {
    vector<double> notas = {9.5, 8.0, 7.5, 10.0, 6.0, 8.5}; // usando initializer list
    double suma = 0;
    for(double n : notas) suma += n;
    cout << "Promedio total: " << (suma / notas.size()) << "\n";
    return 0;
}
