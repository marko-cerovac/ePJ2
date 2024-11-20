1. U fajlovima mogu biti pogrešni podaci i program treba da ih ignoriše, tj. zbog loših podataka (redova) ne smije se prekinuti izvršavanje programa.
Npr. mogu postojati dupli identifikatori prevoznog sredstva u fajlu sa prevoznim sredstvima i tada se kreira samo prvo prevozno sredstvo, a svako sljedeće duplo se ignoriše uz ispis poruke na konzolu.
U fajlu sa iznajmljivanjima voditi računa da se u istom terminu (vrijeme i datum) isto prevozno sredstvo ne smije koristiti više od jednom.
Ako ima više iznajmljivanja za isti termin, simulirati i obraditi prvi iz fajla, a ostale ignorisati uz poruke na konzoli.
Na isti način obraditi linije koje nemaju dovoljno podataka, pogrešne koordinate (van opsega), ....

2. Svako prevozno sredstvo iz liste iznajmljivanja mora postojati u fajlu prevoznih sredstava.

3. Vrijednosti za dokumenta korisnika mogu imati proizvoljne vrijednosti.
Voditi računa da polja postoje u modelu.
Nije obavezno praviti posebno listu korisnika (kao što ima za vozila), i objekti korisnika se mogu ponavljati.

4. Na mapi ispisivati identifikator vozila i status baterije.
Ne treba označavati sva polja na putanji već samo trenutno gdje se prevozno sredstvo nalazi (labela + boja ili sličica).
Nema sudara ni čekanja da prevozno sredstvo prođe polje da bi drugo došlo na to polje.
Na polju može biti više prevoznih sredstava u jednom trenutku i svi identifikatori se ispisuju.

5. Serijalizuju se samo rezultati dodatnih opcija (po broju indeksa)
