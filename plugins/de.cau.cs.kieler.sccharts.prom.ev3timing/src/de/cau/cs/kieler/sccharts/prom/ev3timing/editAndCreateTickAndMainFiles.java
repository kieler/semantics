package de.cau.cs.kieler.sccharts.prom.ev3timing;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.io.*;

public class editAndCreateTickAndMainFiles {

	public static String insertString(String bag, String insert, int index) {
		String bagBegin = bag.substring(0, index);
		String bagEnd = bag.substring(index);
		return bagBegin + insert + bagEnd;
	}

	// number of timing programm points in the c file
	int tppCount = -1;

	// stateList contains all state relevant variables
	List<String> stateList = new ArrayList<>();

	// list of combinations of state variables. Per combinaltion a list with
	// state and the value
	List<List<Entry<String, String>>> combinationList = new ArrayList<>();

	// the inputvariables of the scchart with the testvalues
	List<Entry<String, List<String>>> globalVarList = new ArrayList<>();

	// a list of timing blocks to test
	List<Entry<String, String>> FWCETList = new ArrayList<>();

	// The known WCET timings for hostcodecalls
	List<Entry<String, String>> FunctionWCETList = new ArrayList<>();

	// the known hostcodecalls with block mapping
	List<String> FunctionWCETBlockList = new ArrayList<>();

	public void editTickFile(String path, String fileName) throws IOException {

		String newline = System.lineSeparator();

		int indexOfTick;
		// Load generated tickFunction

		File file = new File(path);
		String tickFile = FileUtils.readFileToString(file);


		// Check for edited
		if (tickFile.contains("/* Im edit the generated TickFunction       */")
				&& tickFile
						.contains("/* It now ready to timing                   */")) {
			System.err.println("sct is previewsly edited");

			return;
		}

		// Mark the Tick File
		String comment = "/* Im edit the generated TickFunction       */"
				+ newline + "/* It now ready to timing                   */"
				+ newline + "#include \"" + fileName + ".h\"" + newline
				+ newline + newline;
		// define TPP replacment

		comment += "#define TPP(LABEL) "
				+ "asm volatile(\"\" ::: \"memory\"); "
				+ "timingTPP##LABEL = *systemTimer; "
				+ "asm volatile(\"\" ::: \"memory\") " + newline + newline;

		tickFile = insertString(tickFile, comment, 0);

		// get TPP count
		if (tppCount == -1) {
			if (tickFile.contains("TPP(")) {
				String tpp = tickFile
						.substring(tickFile.lastIndexOf("TPP(") + 4);
				tpp = tickFile.substring(tickFile.lastIndexOf("TPP(") + 4);
				tppCount = Integer.parseInt(tpp.substring(0, tpp.indexOf(')')));
			} else {
				tppCount = 0;
			}
		}

		String start = "void tick(){";

		// find TickIndex

		indexOfTick = tickFile.indexOf(start);

		// Insert StartStamp
		int indexOfStart = tickFile.indexOf(start) + start.length();

		tickFile = insertString(tickFile, newline + "TPP(Entry);" + newline

		, indexOfStart);

		// Find End of Tick.
		String end = "return;";

		indexOfTick = tickFile.indexOf(start);

		int offsetOfEnd = tickFile.substring(indexOfTick).lastIndexOf(end);

		// Insert EndStamp
		tickFile = insertString(tickFile, newline + "TPP(Exit);" + newline,
				indexOfTick + offsetOfEnd);

		// build Timing Variables

		String timingVars = "unsigned long timingTPPEntry, timingTPPExit";

		for (int i = 1; i <= tppCount; i++) {
			timingVars = timingVars + ", timingTPP" + i;

		}
		timingVars = timingVars + ";" + newline;

		// replace calls with known wcet and insert callcounter


		indexOfTick = tickFile.indexOf(start);

		for (Entry<String, String> e : FunctionWCETList) {

			while (tickFile.substring(indexOfTick).contains(e.getKey() + "(")) {

				int tppIndex = tickFile.indexOf(
						"TPP(",
						(tickFile.substring(indexOfTick).indexOf(
								e.getKey() + "(") + indexOfTick))
						 + 4;

				System.err.println(tickFile.substring(tppIndex));

				String i = tickFile.substring(tppIndex,
						tickFile.indexOf(");", tppIndex));

				tickFile = tickFile.replaceFirst(e.getKey() + "\\((.*?\\);)",
						"asm volatile(\"\" ::: \"memory\");  " + e.getKey()
								+ "_timing_" + i
								+ "++; asm volatile(\"\" ::: \"memory\"); ");

				if (!timingVars.contains("int " + e.getKey() + "_timing_" + i
						+ " = 0;")) {
					timingVars += "int " + e.getKey() + "_timing_" + i
							+ " = 0;" + newline;
					FunctionWCETBlockList.add(e.getKey() + "_timing_" + i);
				}
			}

		}

		// Insert Timing Variables

		String goVars = "char _GO;";
		int indexOfVars = tickFile.indexOf(goVars);

		tickFile = insertString(tickFile, newline + timingVars + newline,
				indexOfVars);

		// Generate SetFunction
		List<Map.Entry<String, String>> oneSetList;
		String oneSetFunction = "";

		String timingSetFunctions = "";

		if (combinationList.isEmpty()) {

			int size = stateList.size();
			int setCounter = 0;

			for (int i = 0; i < (int)Math.pow(2,size); i++) {
				List<Map.Entry<String, String>> valueList = new ArrayList<>();
				int counterCopy = setCounter;
				for (int j = 0; j < size; j++) {
					System.err.println((int)Math.pow(2,size) + "  k  " + i);
					valueList.add(new AbstractMap.SimpleEntry<>(stateList
							.get(j), Integer.toString(counterCopy % 2)));
					counterCopy = counterCopy / 2;
				}
				combinationList.add(valueList);
				setCounter++;

			}
		}

		for (int i = 0; i < combinationList.size(); i++) {

			oneSetList = combinationList.get(i);

			oneSetFunction = "void set" + i + "(){";

			for (int j = 0; j < oneSetList.size(); j++) {
				oneSetFunction = oneSetFunction + newline
						+ oneSetList.get(j).getKey() + " = "
						+ oneSetList.get(j).getValue() + ";";

			}
			oneSetFunction = oneSetFunction + newline + "}" + newline;
			timingSetFunctions = timingSetFunctions + oneSetFunction;

		}

		// Insert SetFunctions

		String resetFunction = "void reset(){";
		int indexOfSetFunction = tickFile.indexOf(resetFunction);

		tickFile = insertString(tickFile, newline + timingSetFunctions
				+ newline, indexOfSetFunction);

		FileUtils.write(file, tickFile);

		return;

	}

	// Helper to read the keywords
	private void decodeLine(String line) {

		if (line.startsWith("HighestTPPNumber ")) {
			tppCount = Integer.parseInt(line.substring("HighestTPPNumber "
					.length()));
		}

		if (line.startsWith("State ")) {

			stateList.add(line.substring("State ".length()));

		}
		if (line.startsWith("FWCET ")) {
			line = line.substring("FWCET ".length());

			FWCETList.add(new AbstractMap.SimpleEntry<>(line.substring(0,
					line.indexOf(' ')), line.substring(line.indexOf(' '))));
		}
		if (line.startsWith("FunctionWCET ")) {
			line = line.substring("FunctionWCET ".length());

			FunctionWCETList.add(new AbstractMap.SimpleEntry<>(line.substring(
					0, line.indexOf(' ')), line.substring(line.indexOf(' '))));
		}

		if (line.startsWith("GlobalVar ")) {
			line = line.substring("GlobalVar ".length());
			String varName = line.substring(0, line.indexOf(' '));
			line = line.substring(line.indexOf(' '));
			line = line.replaceAll("\\s", "");
			List<String> values = new ArrayList<String>();

			int start = Integer.parseInt(line.substring(0, line.indexOf("..")));
			int end = Integer.parseInt(line.substring(line.indexOf("..") + 2));

			for (int i = start; i <= end; i++) {
				values.add(String.valueOf(i));
			}

			globalVarList.add(new AbstractMap.SimpleEntry<>(varName, values));

		}
		return;
	}

	public void readTa(String path) throws IOException {

		String newline = System.lineSeparator();

		int i = 1;
		int rightIndex;
		String taCopy;
		String line = "";
		int stateCount;

		// Load ta file

		File file = new File(path);
		String taFile = FileUtils.readFileToString(file);

		// Read keywords State FWCET FunctionWCET GlobalVar

		taCopy = taFile;
		rightIndex = 0;

		while (taCopy != "") {

			if (taCopy.contains(newline)) {
				rightIndex = taCopy.indexOf(newline);
				if (rightIndex > 0) {
					line = taCopy.substring(0, rightIndex);
					decodeLine(line);
				}

				taCopy = taCopy.substring(rightIndex + 1);

			} else {
				rightIndex = taCopy.length();
				line = taCopy.substring(0, rightIndex);
				decodeLine(line);
				taCopy = "";

			}

		}

		// Read Combinations
		taCopy = taFile;
		rightIndex = 0;
		stateCount = stateList.size();

		int endIndex;
		while (taCopy != "") {

			if (taCopy.startsWith("Combination")) {
				try {
					taCopy = taCopy.substring(taCopy.indexOf(newline) + 1);
					List<Map.Entry<String, String>> valueList = new ArrayList<>();

					for (i = 0; i < stateCount; i++) {
						if (taCopy.contains(newline)) {
							endIndex = taCopy.indexOf(newline);
						} else {
							endIndex = taCopy.length();
						}

						valueList.add(new AbstractMap.SimpleEntry<>(taCopy
								.substring(0, taCopy.indexOf(' ')), taCopy
								.substring(taCopy.indexOf(' '), endIndex)));

						if (taCopy.contains(newline)) {
							taCopy = taCopy
									.substring(taCopy.indexOf(newline) + 1);
						} else {
							taCopy = "";
						}
					}
					combinationList.add(valueList);

				} catch (Exception e) {

					System.out.println("Combination error!");
					e.printStackTrace();
				}

			} else {
				if (taCopy.contains(newline)) {
					taCopy = taCopy.substring(rightIndex + 1);
				} else {
					taCopy = "";
				}
			}
		}

		return;
	}

	private String createMainC(String fileName) {

		String newline = System.lineSeparator();

		String start = "";
		String end = "";
		String decl = "";
		String openLoops = "";
		String closeLoops = "";
		String selectSet = "";
		String instance = "";
		String bufferValues = "";
		String initResults = "";
		String tickResults = "";
		String tick = "";
		String openRerun = "";
		String closeRerun = "";

		// calc max. csv buffer size
		int bufferSize = (37 + tppCount * 13);

		for (Entry<String, List<String>> l : globalVarList) {
			bufferSize += 2 + Integer.parseInt(l.getValue().get(
					l.getValue().size() - 1));
		}

		// static List<Map.Entry<String, List<String>>> globalVarList = new
		// ArrayList<>();

		initResults += "SetNr";
		for (Entry<String, List<String>> e : globalVarList) {
			initResults += "," + e.getKey();
		}

		initResults += ",TPP(Entry)";

		for (int i = 1; i <= tppCount; i++) {
			initResults += ",TPP(" + i + ")";
		}
		initResults += ",TPP(Exit)";

		for (String e : FunctionWCETBlockList) {
			initResults += "," + e;
		}

		initResults += "\\n";

		start += "#include \"" + fileName + ".c\"" + newline + "#include \""
				+ fileName + ".h\"" + newline + newline + "#include <time.h>"
				+ newline + "#include <sys/time.h>" + newline
				+ "#include <stdlib.h>" + newline + "#include <stdio.h>"
				+ newline + "#include <stdlib.h>" + newline
				+ "#include <fcntl.h>" + newline + "#include <sys/mman.h>"
				+ newline + "#include <unistd.h>" + newline + newline
				+ "unsigned long *systemTimer = 0;" + newline + "int run = 1;"
				+ newline + "int main(){";
		newline += "\t";
		start += newline
				+ newline
				+ newline
				+ newline
				+ "//Address to timing register in Memory"
				+ newline
				+ "off_t offset = 0x1c20010;"
				+ newline
				+ "size_t len = 8;"
				+ newline
				+ "size_t pagesize = sysconf(_SC_PAGE_SIZE);"
				+ newline
				+ "off_t page_base = (offset / pagesize) * pagesize;"
				+ newline
				+ "off_t page_offset = offset - page_base;"
				+ newline
				+ newline
				+ "int fd = open(\"/dev/mem\", O_SYNC);"
				+ newline
				+ "unsigned char *mem = mmap(NULL, page_offset + len, PROT_READ , MAP_SHARED, fd, page_base);"
				+ newline + newline + "if (mem == MAP_FAILED) {" + newline
				+ "	perror(\"Can't map memory\");" + newline + "	return -1;"
				+ newline + "}" + newline + newline
				+ "//Pointer to the 32Bit timing register" + newline
				+ "systemTimer = mem + page_offset + 4;" + newline + newline
				+ "//write header of csv" + newline + "FILE *fp;" + newline
				+ "fp = fopen(\"./result.csv\", \"w+\");" + newline
				+ "fprintf(fp, \"" + initResults + "\");" + newline
				+ "fclose( fp );" + newline + newline;

		decl += "char buf[" + bufferSize + "];" + newline + "int bufNeed = 0;"
				+ newline + "int currBufIndex = 0;" + newline;

		decl += "int stateLoopcount;" + newline;

		for (Entry<String, List<String>> e : globalVarList) {

			String loopVar = e.getKey() + "Loopcount;";
			String name = e.getKey();
			decl += "int " + loopVar + newline;
			decl += "int " + name + "Arr[" + e.getValue().size() + "] = {"
					+ e.getValue().get(0);

			for (int j = 1; j < e.getValue().size(); j++) {
				decl += ", " + e.getValue().get(j);
			}
			decl += "};" + newline;
		}

		decl += "int rerun = 0;" + newline;

		decl += newline;
		newline += "	";
		openLoops += "for(stateLoopcount = 0; stateLoopcount < "
				+ combinationList.size() + "; stateLoopcount++){" + newline;

		for (Entry<String, List<String>> e : globalVarList) {

			String loopVar = e.getKey() + "Loopcount";
			String name = e.getKey();

			openLoops += newline;
			newline += "	";
			openLoops += "for(" + loopVar + " = 0; " + loopVar + " < "
					+ e.getValue().size() + "; " + loopVar + "++) {" + newline
					+ newline + name + " = " + name + "Arr[" + loopVar + "];"
					+ newline;

		}

		openRerun += "rerun = 10;" + newline;

		openRerun += newline + "while(rerun){";
		newline += "	";
		openRerun += newline + newline;

		selectSet += "reset();" + newline;

		for (int i = 0; i < combinationList.size(); i++) {
			selectSet += "if(stateLoopcount == " + i + "){" + newline + "	set"
					+ i + "();" + newline + "}" + newline + newline;
		}

		selectSet += newline;

		tick += newline + "tick();" + newline + newline;

		tickResults += "bufNeed = sprintf (&buf[currBufIndex], \"%u\", stateLoopcount);"
				+ newline + "currBufIndex = currBufIndex + bufNeed;" + newline;

		for (Entry<String, List<String>> e : globalVarList) {
			String loopVar = e.getKey() + "Loopcount";
			tickResults += "buf[currBufIndex] = ',';" + newline
					+ "currBufIndex ++;" + newline
					+ "bufNeed = sprintf (&buf[currBufIndex], \"%d\", "
					+ loopVar + ");" + newline
					+ "currBufIndex = currBufIndex + bufNeed;" + newline;
		}
		;

		tickResults += "buf[currBufIndex] = ',';"
				+ newline
				+ "currBufIndex ++;"
				+ newline
				+ "bufNeed = sprintf (&buf[currBufIndex],\"%lu\",timingTPPEntry);"
				+ newline + "currBufIndex = currBufIndex + bufNeed;" + newline;

		for (int i = 1; i <= tppCount; i++) {
			tickResults += "buf[currBufIndex] = ',';" + newline
					+ "currBufIndex ++;" + newline
					+ "bufNeed = sprintf (&buf[currBufIndex],\"%lu\",timingTPP"
					+ i + ");" + newline
					+ "currBufIndex = currBufIndex + bufNeed;" + newline;

		}

		tickResults += "buf[currBufIndex] = ',';"
				+ newline
				+ "currBufIndex ++;"
				+ newline
				+ "bufNeed = sprintf (&buf[currBufIndex],\"%lu\",timingTPPExit);"
				+ newline + "currBufIndex = currBufIndex + bufNeed;" + newline;

		for (String s : FunctionWCETBlockList) {

			tickResults += "buf[currBufIndex] = ',';" + newline
					+ "currBufIndex ++;" + newline
					+ "bufNeed = sprintf (&buf[currBufIndex], \"%u\", " + s
					+ ");" + newline + "currBufIndex = currBufIndex + bufNeed;"
					+ newline;

		}

		tickResults += "buf[currBufIndex] = '\\n';" + newline
				+ "currBufIndex ++;" + newline;

		closeRerun += newline;
		for (String s : FunctionWCETBlockList) {

			closeRerun += s + " = 0;" + newline;
		}

		closeRerun += "rerun--;" + newline + newline;

		closeRerun += "buf[currBufIndex] = '\\0';" + newline
				+ "fp = fopen(\"./result.csv\", \"a\");" + newline
				+ "fputs(buf , fp);" + newline + "fclose( fp );" + newline
				+ "currBufIndex = 0;" + newline;

		newline = newline.substring(0, newline.length() - 1);
		closeRerun += newline + "}" + newline + newline;

		for (int i = 0; i < globalVarList.size(); i++) {
			newline = newline.substring(0, newline.length() - 1);
			closeLoops += newline + "}";
		}

		newline = newline.substring(0, newline.length() - 1);
		closeLoops += newline + "}" + newline;

		newline = newline.substring(0, newline.length() - 1);
		end = "return 0;" + newline + "}";

		newline = System.lineSeparator();

		instance = start + decl + openLoops + openRerun + selectSet + tick
				+ tickResults + closeRerun + closeLoops + end;

		return instance;

	}

	public String createHFile() {
		String newline = System.lineSeparator();

		String hFile = "";

		// insert Timing Vars

		hFile += "extern unsigned long *systemTimer;" + newline
				+ "extern unsigned long timingTPPEntry, timingTPPExit";
		for (int i = 1; i <= tppCount; i++) {
			hFile += ", timimgTPP" + i;
		}

		// insert scchart vars
		if (globalVarList.size()>0){
		hFile += ";" + newline + newline + "extern char "
				+ globalVarList.get(0).getKey();

		}
		
		
		for (int i = 1; i < globalVarList.size(); i++) {
			hFile += ", " + globalVarList.get(i).getKey();
		}
		hFile += ";" + newline;

		return hFile;
	}

	public void start(String folderPath, String tickFileName) {
		try {

			readTa(folderPath.substring(0, folderPath.indexOf("kieler-gen"))
					+ tickFileName + ".ta");

			editTickFile(folderPath + tickFileName + ".c", tickFileName);

			File mainC = new File(folderPath + "main.c");
			FileUtils.write(mainC, createMainC(tickFileName));

			File mainH = new File(folderPath + tickFileName + ".h");
			FileUtils.write(mainH, createHFile());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
