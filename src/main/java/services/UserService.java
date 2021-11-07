package services;

import model.User;

public class UserService {




    //HARD
    //1.Zorg ervoor dat een persoon ook aangemaakt wordt
    //2.Maak een controle methode die vraagt om een gebruiker een passwoord twee keer in te geven
    //3. Het wachtwoord wordt hier geincrypteerd
    public void createUser(){

    }

    //EASY
    //Als er geen User terug gegeven wordt, stuur als bericht "User does not exist"
    public User getOneUserByName(){
        User user = null;
        if(user!= null)
            System.out.println(user);
        else System.out.println("User does not exist");

        return user;
    }

    //EASY
    //print een lijst uit van alle users.
    public void getAllUsers(){

    }

    //EASY
    //Een username mag niet aangepast worden
    //Bonus HARD
    //De Person hoef je niet te updaten (als je dat wilt, doe je dat best via een aparte personservice,
    // via een aprte updatePersonMethode)
    public void updateUser(){


    }

    //MEDIUM
    //Vraag de User een passwoord in te geven voor dat hij zijn account kan verwijderen.
    //De Person moet ook mee gedeleted worden
    public void deleteUser(){

    }

    //----
    //extra private methodes hieronder
}
