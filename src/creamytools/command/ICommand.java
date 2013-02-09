package creamytools.command;

/**
 * コマンドクラスのスーパーインターフェース
 * @author Ryusaburo Tanaka (Professor Akiguchi's PBL 2012, AIIT)
 */
public interface ICommand {
    
    /**
     * コマンド実行
     * @param args 入力パラメータ群 
     */
    public void exec(String[] args);
}
