package nazo01.plugin;

import java.io.File;
import java.io.IOException;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class nazo01 extends JavaPlugin implements CommandExecutor {

	public int a = 114514;

	@Override
	public void onDisable() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onDisable();
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		if(!(sender instanceof Player)) {
			return false;
		}
		switch(args.length) {
		case 0:
			sender.sendMessage("�P�c�ł���");
			File file = new File(this.getDataFolder(), "nazo.txt");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO �����������ꂽ catch �u���b�N
				sender.sendMessage("�_���݂����ł���");
				e.printStackTrace();
			}
			break;
		case 1:
			sender.sendMessage("you have �钆������Ȃ������H");
			Player player =  (Player)sender;
			ItemStack item = new ItemStack(Material.CAKE);
			player.getInventory().addItem(item);
			break;
		}

		return true;
	}

	@Override
	public void onEnable() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onEnable();
		getCommand("nazo").setExecutor(this);
		System.out.println(a);

	}

}
