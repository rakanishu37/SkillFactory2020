package net.Avalith.CollectionsInterfaces.Ej6;

/**
 * Los socios deben tener la posibilidad de ser comparados por su nombre
 * ● Crear una clase Club en donde los ClubMember van a tener la posibilidad de hacerse socios, votar y renunciar.
 * ● Entre los mismos socios se votan entre ellos para elegir presidente, la unica condicion es que no se pueden votar a ellos mismos.
 * ● Por reglamento del club tampoco se puede votar 2 veces, si esto ocurre se descalifica al socio quitándole la posibilidad de ser
 * votado por el resto.
 * ● Cada voto debe ir acompañado del id del socio que votó, si no ingresa su id, a este socio que votó, se le resta un voto, siempre y
 * cuando tenga votos, sino, no se le resta.
 * ● El club mes a mes va publicando una lista actualizada de sus socios, ordenada por orden alfabético (investigar cómo ayudar a la
 * colección a comparar objetos).
 */
public class Ej6Main {
    public static void main(String[] args) {
        ClubMember c1 = new ClubMember("f","1234567",20);
        ClubMember c2 = new ClubMember("a","4234567",30);
        ClubMember c3 = new ClubMember("zz","3234567",25);
        ClubMember c4 = new ClubMember("b","8234567",19);

        Club club = new Club();
        club.addMember(c1);
        club.addMember(c2);
        club.addMember(c3);
        club.addMember(c4);

        club.vote(c1.getId(),c2.getId());
        club.vote(c3.getId(),c2.getId());
        club.vote(c4.getId(),c2.getId());
        club.vote(c2.getId(),c1.getId());

        System.out.println("THe most voted member is: "+club.publishMostVotedMember());
        System.out.println(club.publishMemberList());
    }


}
