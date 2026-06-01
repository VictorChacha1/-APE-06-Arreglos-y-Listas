#include <iostream>
#include <vector>
using namespace std;
class Prod { public: string nom; int cant; double pre;
    Prod(string n, int c, double p) : nom(n), cant(c), pre(p) {}
};
int main() {
    vector<Prod> inv; 
    inv.push_back(Prod("Mouse", 10, 15.5));
    double total = 0;
    for(Prod p : inv) total += (p.cant * p.pre);
    cout << "Valor inventario: $" << total << "\n";
    return 0;
}
