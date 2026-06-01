#include <iostream>
#include <list>
using namespace std;
int main() {
    list<string> turnos;
    turnos.push_back("Turno A"); turnos.push_back("Turno B");
    cout << "Atendiendo: " << turnos.front() << "\n";
    turnos.pop_front(); 
    cout << "Siguiente: " << turnos.front() << "\n";
    return 0;
}
