package clueAI;

import net.clue.lib.client.RunClient;
import net.clue.lib.client.java.JavaClientAdapter;
import net.clue.lib.clue.Character;
import net.clue.lib.clue.Guess;
import net.clue.lib.clue.MysteryPrimitive;
import net.clue.lib.clue.Point;
import net.clue.lib.clue.Room;

public class MyAI extends JavaClientAdapter {

	public static void main(String[] args) {
		MyAI ai = new MyAI();
		RunClient.runClientWithAdapter(1234, "localhost", ai);
	}
	
	@Override
	public void handleAvailableCharacters(Character[] arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCardDealt(MysteryPrimitive arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCardRevealed(MysteryPrimitive arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCharacterLost(Character arg0, Guess arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCharacterMovedTo(Character arg0, Point arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCharacterSuggested(Character arg0, Guess arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCharacterWon(Character arg0, Guess arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleDisproveDeclined(Character arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleDisproved(Character arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleDisprovedWith(Character arg0, MysteryPrimitive arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleKicked() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleNotifyTransfer(Room arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleRequestDisprove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleTurnRequest(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetGame() {
		// TODO Auto-generated method stub
		
	}

}