package ch8;

public class ChainedExceptionEx {

	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void install() throws InstallException{
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException  | MemoryException e) {
			InstallException ie = new InstallException("설치중 예외발생");
			ie.initCause(e);
			throw ie;
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	 static boolean enoughMemory() {
		return true;
	}

	 static boolean enoughSpace() {
		return false;
	}

}

class InstallException extends Exception{
	 InstallException(String msg) {
		super(msg);
	}
}

class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}
