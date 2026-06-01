#include <iostream>
#include <vector>
using namespace std;
int main() {
    int arr[3] = {1, 2, 3}; // Estatico, no puede crecer
    vector<int> lista;      // Dinamico
    lista.push_back(1); lista.push_back(2);
    cout << "Size arreglo: 3 | Size vector: " << lista.size() << "\n";
    return 0;
}
