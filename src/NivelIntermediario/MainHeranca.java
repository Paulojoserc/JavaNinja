package NivelIntermediario;

public class MainHeranca {
    public static void main(String[] args) {

        // Objeto 1
        Uzumaki Naruto =  new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        // Objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();

        // Objeto 3
        Haruno Sakura =  new Haruno();
        Sakura.nome = "Sakura Haruna";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
        Sakura.AtivarCura();

        //Objeto 4

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 16;
        Hinata.AtivarBaykugan();

        //Objeto 4

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 16;
        Boruto.ModoSabioAtivado();
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();

    }
}
