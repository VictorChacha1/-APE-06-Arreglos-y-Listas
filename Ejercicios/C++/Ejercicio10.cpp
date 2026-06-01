#include <iostream>
#include <list>
using namespace std;
int main() {
    list<string> fila = {"Victor", "Maria", "Jose"};
    while(!fila.empty()) {
        cout << "Despachando a: " << fila.front() << "\n";
        fila.pop_front();
    }
    cout << "No hay mas clientes en fila.\n";
    return 0;
}
