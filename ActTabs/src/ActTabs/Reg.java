package ActTabs;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*AUTOR BYO*/
public class Reg {

     private String[] D1 = {"Alta Verapaz", "Cobán", "San Pedro Carchá", "San Juan Chamelco", "San Cristóbal Verapaz", "Tactic", "Tucurú", "Tamahú", "Panzós", "Senahú", "Santa María Cahabón", "Lanquín", "Chahal", "Fray Bartolomé de las Casas", "Chisec", "Santa Cruz Verapaz", "Santa Catalina La Tinta", "Raxruhá"};
     private String[] D2 = {"Baja Verapaz", "Cubulco", "Santa Cruz el Chol", "Granados", "Purulhá", "Rabinal", "Salamá", "San Miguel Chicaj", "San Jerónimo"};
     private String[] D3 = {"Chimaltenango", "Chimaltenango", "San José Poaquíl", "San Martín Jilotepeque", "San Juan Comalapa", "Santa Apolonia", "Tecpán Guatemala", "Patzún", "Pochuta", "Patzicía", "Santa Cruz Balanyá", "Acatenango", "Yepocapa", "San Andrés Itzapa", "Parramos", "Zaragoza", "El Tejar"};
     private String[] D4 = {"Chiquimula", "Chiquimula", "Camotán", "Concepción Las Minas", "Esquipulas", "Ipala", "Jocotán", "Olopa", "Quezaltepeque", "San José La Arada", "San Juan Ermita", "San Jacinto"};
     private String[] D5 = {"Petén", "Dolores", "La Libertad", "Flores", "Melchor de Mencos", "Poptún", "San Andrés", "San Benito", "San Francisco", "San José", "San Luis", "Santa Ana", "Sayaxché", "Las Cruces"};
     private String[] D6 = {"El Progreso", "Guastatoya", "Morazán", "San Agustín Acasaguastlán", "San Cristóbal Acasaguastlán", "El Jícaro", "Sansare", "Sanarate", "San Antonio La Paz"};
     private String[] D7 = {"Quiché", "Santa Cruz del Quiché", "Canillá", "Chajul", "Chicamán", "Chiché", "Chichicastenango", "Chinique", "Cunén", "Ixcán", "Joyabaj", "Nebaj", "Pachalum", "Patzité", "Sacapulas", "San Andrés Sajcabajá", "San Antonio Ilotenango", "San Bartolomé Jocotenango", "San Juan Cotzal", "San Pedro Jocopilas", "Uspantán", "Zacualpa"};
     private String[] D8 = {"Escuintla", "Escuintla", "Guanagazapa", "Iztapa", "La Democracia", "La Gomera", "Masagua", "Nueva Concepción", "Palín", "San José", "San Vicente Pacaya", "Santa Lucía Cotzumalguapa", "Siquinalá", "Tiquisate"};
     private String[] D9 = {"Guatemala", "Guatemala", "Santa Catarina Pinula", "San José Pinula", "San José del Golfo", "Palencia", "Chinautla", "San Pedro Ayampuc", "Mixco", "San Pedro Sacatepéquez", "San Juan Sacatepéquez", "San Raymundo", "Chuarrancho", "Fraijanes", "Amatitlán", "Villa Nueva", "Villa Canales", "San Miguel Petapa"};
     private String[] D10 = {"Huehuetenango", "Aguacatán1", "Chiantla2", "Colotenango3", "Concepción Huista", "Cuilco", "Huehuetenango", "Jacaltenango", "La Democracia4", "La Libertad5", "Malacatancito", "Nentón", "San Antonio Huista", "San Gaspar Ixchil", "San Ildefonso Ixtahuacán", "San Juan Atitán", "San Juan Ixcoy", "San Mateo Ixtatán", "San Miguel Acatán", "San Pedro Necta", "San Pedro Soloma", "San Rafael La Independencia", "San Rafael Petzal", "San Sebastián Coatán", "San Sebastián Huehuetenango", "Santa Ana Huista", "Santa Bárbara", "Santa Cruz Barillas", "Santa Eulalia", "Santiago Chimaltenango", "Tectitán", "Todos Santos Cuchumatán", "Unión Cantinil"};
     private String[] D11 = {"Izabal", "Puerto Barrios", "El Estor", "Livingston", "Los Amates", "Morales"};
     private String[] D12 = {"Jalapa", "Jalapa", "San Pedro Pinula", "San Luis Jilotepeque", "San Manuel Chaparrón", "San Carlos Alzatate", "Monjas", "Mataquescuintla"};
     private String[] D13 = {"Jutiapa", "Jutiapa", "Agua Blanca", "Asunción Mita", "Atescatempa", "Comapa", "Conguaco", "El Adelanto", "El Progreso", "Jalpatagua", "Jerez", "Moyuta", "Pasaco", "Quesada", "San José Acatempa", "Santa Catarina Mita", "Yupiltepeque", "Zapotitlán"};
     private String[] D14 = {"Quetzaltenango", "Quetzaltenango", "Almolonga", "Cabricán", "Cajolá", "Cantel", "Coatepeque", "Colomba", "Concepción Chiquirichapa", "El Palmar", "Flores Costa Cuca", "Génova", "Huitán", "La Esperanza", "Olintepeque", "San Juan Ostuncalco", "Palestina de Los Altos", "Salcajá", "San Carlos Sija", "San Francisco La Unión", "San Martín Sacatepéquez", "San Mateo", "San Miguel Sigüilá", "Sibilia", "Zunil"};
     private String[] D15 = {"Retalhuleu", "Retalhuleu", "Champerico", "El Asintal", "Nuevo San Carlos", "San Andrés Villa Seca", "San Martín Zapotitlán", "San Felipe", "San Sebastián", "Santa Cruz Muluá"};
     private String[] D16 = {"Sacatepéquez", "Antigua Guatemala", "Alotenango", "Ciudad Vieja", "Jocotenango", "Magdalena Milpas Altas", "Pastores", "San Antonio Aguas Calientes", "San Bartolomé Milpas Altas", "San Lucas Sacatepéquez", "San Miguel Dueñas", "Santa Catarina Barahona", "Santa Lucía Milpas Altas", "Santa María de Jesús", "Santiago Sacatepéquez", "Santo Domingo Xenacoj", "Sumpango"};
     private String[] D17 = {"San Marcos", "San Marcos", "Ayutla", "Catarina", "Comitancillo", "Concepción Tutuapa", "El Quetzal", "El Rodeo", "El Tumbador", "Esquipulas Palo Gordo", "Ixchiguán", "La Reforma", "Malacatán", "Nuevo Progreso", "Ocós", "Pajapita", "Río Blanco", "San Antonio Sacatepéquez", "San Cristóbal Cucho", "San José Ojetenam", "San Lorenzo", "San Miguel Ixtahuacán", "San Pablo", "San Pedro Sacatepéquez", "San Rafael Pie de La Cuesta", "Sibinal", "Sipacapa", "Tacaná", "Tajumulco", "Tejutla"};
     private String[] D18 = {"Santa Rosa", "Cuilapa", "Casillas", "Chiquimulilla", "Guazacapán", "Nueva Santa Rosa", "Oratorio", "Pueblo Nuevo Viñas", "San Juan Tecuaco", "San Rafaél Las Flores", "Santa Cruz Naranjo", "Santa María Ixhuatán", "Santa Rosa de Lima", "Taxisco", "Barberena"};
     private String[] D19 = {"Sololá", "Sololá", "Concepción", "Nahualá", "Panajachel", "San Andrés Semetabaj", "San Antonio Palopó", "San José Chacayá", "San Juan La Laguna", "San Lucas Tolimán", "San Marcos La Laguna", "San Pablo La Laguna", "San Pedro La Laguna", "Santa Catarina Ixtahuacan", "Santa Catarina Palopó", "Santa Clara La Laguna", "Santa Cruz La Laguna", "Santa Lucía Utatlán", "Santa María Visitación", "Santiago Atitlán"};
     private String[] D20 = {"Suchitepéquez", "Mazatenango", "Chicacao", "Cuyotenango", "Patulul", "Pueblo Nuevo", "Río Bravo", "Samayac", "San Antonio Suchitepéquez", "San Bernardino", "San José El Ídolo", "San Francisco Zapotitlán", "San Gabriel", "San Juan Bautista", "San Lorenzo", "San Miguel Panán", "San Pablo Jocopilas", "Santa Bárbara", "Santo Domingo Suchitepequez", "Santo Tomas La Unión", "Zunilito"};
     private String[] D21 = {"Totonicapan", "Totonicapán", "Momostenango", "San Andrés Xecul", "San Bartolo", "San Cristóbal Totonicapán", "San Francisco El Alto", "Santa Lucía La Reforma", "Santa María Chiquimula"};
     private String[] D22 = {"Zacapa", "Cabañas", "Estanzuela", "Gualán", "Huité", "La Unión", "Río Hondo", "San Diego", "Teculután", "Usumatlán", "Zacapa"};
     DriverBD Driver = new DriverBD();

     public void BorrarRegistros(DriverBD DRIVER1) {
          try {
               DRIVER1.EjecutarQuery("DELETE FROM municipio");
               DRIVER1.EjecutarQuery("DELETE FROM departamento");
          } catch (SQLException ex) {
               Logger.getLogger(Reg.class.getName()).log(Level.SEVERE, null, ex);
          }
     }

     public void RegistrarDeptos(DriverBD DRIVER1) {
          try {
               int NUMDEPTO = 1;
               int NUMMUNI = 1;
               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D1[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D1.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D1[0] + "', '" + D1[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }


               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D2[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D2.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D2[0] + "', '" + D2[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D3[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D3.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D3[0] + "', '" + D3[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D4[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D4.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D4[0] + "', '" + D4[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D5[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D5.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D5[0] + "', '" + D5[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D6[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D6.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D6[0] + "', '" + D6[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D7[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D7.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D7[0] + "', '" + D7[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D8[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D8.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D8[0] + "', '" + D8[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D9[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D9.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D9[0] + "', '" + D9[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D10[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D10.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTOmunicipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D10[0] + "', '" + D10[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D11[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D11.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D11[0] + "', '" + D11[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D12[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D12.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D12[0] + "', '" + D12[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D13[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D13.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D13[0] + "', '" + D13[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D14[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D14.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D14[0] + "', '" + D14[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D15[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D15.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D15[0] + "', '" + D15[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D16[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D16.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D16[0] + "', '" + D16[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D17[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D17.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D17[0] + "', '" + D17[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D18[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D18.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D18[0] + "', '" + D18[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D19[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D19.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D19[0] + "', '" + D19[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D20[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D20.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D20[0] + "', '" + D20[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D21[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D21.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D21[0] + "', '" + D21[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }

               DRIVER1.EjecutarQuery("INSERT INTO departamento (`ID_Departamento`, `Descripcion`) VALUES ('" + NUMDEPTO + "', '" + D22[0] + "');");
               NUMDEPTO = NUMDEPTO + 1;
               for (int N = 1; N < this.D22.length; N++) {
                    DRIVER1.EjecutarQuery("INSERT INTO municipio (`ID_Municipio`, `Departamento`, `Descripcion`) VALUES ('" + NUMMUNI + "', '" + D22[0] + "', '" + D22[N] + "');");
                    NUMMUNI = NUMMUNI + 1;
               }
          } catch (SQLException ex) {
               Logger.getLogger(Reg.class.getName()).log(Level.SEVERE, null, ex);
          }
     }
}
