package TP;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro(true, true, 50);

         equipamento equipamento = new equipamento(true);

        // Mostrando o estado inicial do equipamento sonoro
        System.out.println("Estado inicial do equipamento sonoro:");
        System.out.println(equipamentoSonoro);

        // Desligando o equipamento sonoro
        equipamentoSonoro.desligar();
        System.out.println("Equipamento sonoro desligado:");
        System.out.println(equipamentoSonoro);

        // Ligando o equipamento sonoro
        equipamentoSonoro.ligar();
        System.out.println("Equipamento sonoro ligado:");
        System.out.println(equipamentoSonoro);

        // Mudando para modo mono
        equipamentoSonoro.mono();
        System.out.println("Equipamento sonoro em modo mono:");
        System.out.println(equipamentoSonoro);

        // Aumentando o volume
        equipamentoSonoro.aumentarVolume();
        System.out.println("Volume aumentado:");
        System.out.println(equipamentoSonoro);

        // Diminuindo o volume
        equipamentoSonoro.diminuirVolume();
        System.out.println("Volume diminuído:");
        System.out.println(equipamentoSonoro);
        // Diminuindo o volume

        equipamentoSonoro.stereo();
        System.out.println("Equipamento sonoro em modo stereo:");
        System.out.println(equipamentoSonoro);
        
        equipamento.ligar();

        System.out.println("Estado inicial do equipamento :");
        System.out.println(equipamento);

        equipamento.desligar();

        System.out.println("Estado inicial do equipamento :");
        System.out.println(equipamento);

    }

}


