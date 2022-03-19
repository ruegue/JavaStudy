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
			InstallException ie = new InstallException("��ġ�� ���ܹ߻�");
			ie.initCause(e);
			throw ie;
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �����մϴ�.");
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
