	
Kirándulások (Java)
A Hegyi Emberek Természetjáró Klubja (HETEK) évente rengeteg túrát szervez. Mindegyik túrán feljegyzik a túrán részt vett kirándulók neveit.
Az adatokat egy állományba gyűjtik össze, melynek sorai a következő formájúak:
túra_megnevezése:túrázó_neve[;túrázó_neve]…
Írjon programot, amely parancssori argumentumként megkapja a túrák adatait tartalmazó állomány nevét, majd meghatározza és a standard
kimenetre írja soronként egyesével azoknak a túrázóknak a neveit, akik mindegyik túrán részt vettek! Ha egynél több ilyen túrázó lenne, 
akkor az ő neveiket lexikografikusan növekvő sorrendben (ábécérendben) jelenítse meg a kimeneten!

Példa állomány (sample.txt) :
Bukki bolyongas:Norbert;Balazs;Peter;Hajnalka;Bela;Tamas;Bendeguz;Szilvia
Matrai maszkalas:Tamas;Marta;Miklos;Peter;Norbert;Mihaly;Kelemen;Lidia
Cserhati csoszogas:Gabor;Csilla;Lidia;Peter;Csaba;Szilvia;Csongor;Tamas

Parancssori argumentumok:
sample.txt

A futtatás eredménye a standard kimeneten:
Peter
Tamas
