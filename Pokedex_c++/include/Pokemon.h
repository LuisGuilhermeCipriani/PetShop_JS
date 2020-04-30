#ifndef POKEMON_H
#define POKEMON_H
#include <iostream>
using namespace std;

class Pokemon
{
    public:
        Pokemon();
        virtual ~Pokemon();
        string getNome();
        void setNome(string nome);
        int getId();
        void setId(int id);
        string getTipo();
        void setTipo(string tipo);
    protected:
    private:
        string nome;
        int id;
        string tipo;
};

#endif // POKEMON_H
